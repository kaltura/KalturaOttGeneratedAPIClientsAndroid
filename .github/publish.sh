#!/bin/bash

fail() {
  echo "$@" 1>&2
  exit 1
}

chmod +x gradlew
 
 # Create javadoc jar, sources jar, pom
#./gradlew KalturaClient:build

echo "ls $PWD"
echo "ls $PWD/.kltrenv"

# Upload
#./gradlew KalturaClient:publishToSonatype #closeAndReleaseSonatypeStagingRepository
