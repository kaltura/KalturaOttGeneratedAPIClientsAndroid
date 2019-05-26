#!/bin/bash

# Required env vars:
# TRAVIS_TAG: current tag (e.g. v0.1.2)
# BINTRAY_USER, BINTRAY_KEY

# Run locally:
# TRAVIS_TAG=v0.1.2 BINTRAY_USER=username BINTRAY_KEY=fjkhsdfka3289r82rkfe ./travis-push-to-bintray.sh


DRY_RUN=false

# Only allow tags
if [ -z "$TRAVIS_TAG" ]; then 
    echo "Not a Travis tag build; will perform a dry-run."
    TRAVIS_TAG=v0.0.0
    DRY_RUN=true
fi

# The tag name is KalturaOttAndroidClient-VERSION -- remove that prefix (24 chars).
TAG_VERSION_NAME=${TRAVIS_TAG:24}    

# Only allow proper "digits.digits.digits.digits" versions.
if [[ ! $TAG_VERSION_NAME =~ ^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
    echo "Not a proper version string; will perform a dry-run." 
    DRY_RUN=true
fi

# Check that defined library version matches the tag.
if ! grep -q "ext.kalturaClientVersion = '$TAG_VERSION_NAME'" KalturaClient/version.gradle
then
    echo "Library version name in build.gradle does not match tag name; will perform a dry-run."
    DRY_RUN=true
fi


# Assuming a successful KalturaClient:build, create javadoc jar, sources jar, pom
./gradlew KalturaClient:publishReleasePublicationToMavenLocal

# Upload
./gradlew KalturaClient:bintrayUpload -PdryRun=$DRY_RUN -PbintrayUser=$BINTRAY_USER -PbintrayKey=$BINTRAY_KEY
