#!/bin/bash

echo "build.sh"

. ./.circleci/helpers/debundle-context.sh

. ./.circleci/helpers/install-deps.sh

. ./.circleci/helpers/maven-build.sh

echo "build is done!"

