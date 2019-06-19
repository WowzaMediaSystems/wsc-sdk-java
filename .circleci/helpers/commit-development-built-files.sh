#!/bin/bash

echo "commit-development-built-files.sh"

git add target/WowzaCloudSDK-java-client-1.3.1.zip

git commit -m "Wowza Streaming Cloud Java SDK Version 1.3.1 build ${CURRENT} [ci skip]"

git push --set-upstream origin development
