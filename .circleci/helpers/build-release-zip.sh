#!/bin/bash

echo "build-release-zip.sh"

zip -j -r target/WowzaCloudSDK-java-client-1.3.0.zip target/WowzaCloudSDK-java-client-1.3.0*.jar
rm target/WowzaCloudSDK-java-client-1.3.0*.jar

