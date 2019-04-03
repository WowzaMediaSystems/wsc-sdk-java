#!/bin/bash

echo "build.sh"

. ./.circleci/helpers/debundle-context.sh

. ./.circleci/helpers/install-deps.sh

. ./.circleci/helpers/manage-environment-pom.sh

. ./.circleci/helpers/maven-build.sh

. ./.circleci/helpers/build-release-zip.sh

. ./.circleci/helpers/commit-built-files.sh

echo "build is done!"

