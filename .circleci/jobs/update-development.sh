#!/bin/bash

echo "update-development.sh"

. ./.circleci/helpers/debundle-context.sh

. ./.circleci/helpers/setup-git.sh

. ./.circleci/helpers/install-deps.sh

. ./.circleci/helpers/manage-environment.sh

. ./.circleci/helpers/maven-build.sh

. ./.circleci/helpers/check-test-results.sh

. ./.circleci/helpers/build-release-zip.sh

. ./.circleci/helpers/commit-development-built-files.sh

echo "update-development.sh is done!"

