#!/bin/bash

echo "build-release-zip.sh"

rm -f target/WowzaCloudSDK-java-client-1.3.0.zip
rm -f target/WowzaCloudSDK-java-client-1.3.1.zip
zip -j -r target/WowzaCloudSDK-java-client-1.3.1.zip target/WowzaCloudSDK-java-client-1.3.1*.jar
rm target/WowzaCloudSDK-java-client-1.3.1*.jar

