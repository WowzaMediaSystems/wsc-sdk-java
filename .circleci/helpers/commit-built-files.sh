#!/bin/bash

echo "commit-built-files.sh"

git add target/WowzaCloudSDK-java-client-1.3.0.zip

git commit -m "Wowza Streaming Cloud Java SDK Version 1.3.0 build ${CURRENT}"

git push --set-upstream origin development
