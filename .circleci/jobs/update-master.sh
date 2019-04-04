#!/bin/bash

echo "update-master.sh"

. ./.circleci/helpers/debundle-context.sh

. ./.circleci/helpers/setup-git.sh

. ./.circleci/helpers/install-deps.sh

. ./.circleci/helpers/manage-environment.sh

. ./.circleci/helpers/maven-build.sh

. ./.circleci/helpers/check-test-results.sh

. ./.circleci/helpers/publish-documentation.sh

echo "update-master.sh is done!"

