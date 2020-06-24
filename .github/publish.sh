#!/bin/bash

fail() {
  echo "$@" 1>&2
  exit 1
}

# Check that defined library version matches the tag.
if ! grep -q "ext.kalturaClientVersion = '$TAG_VERSION_NAME'" version.gradle
then
    fail "Library version name in build.gradle does not match tag name"
fi


# Create javadoc jar, sources jar, pom
./gradlew KalturaClient:build
./gradlew KalturaClient:publishReleasePublicationToMavenLocal

# Upload
./gradlew KalturaClient:bintrayUpload -PdryRun=false -PbintrayUser=$BINTRAY_USER -PbintrayKey=$BINTRAY_KEY
