#!/bin/bash

echo "check-test-results.sh"

TESTREPORTS=target/surefire-reports/*.txt

STARTED=0;
for f in $TESTREPORTS
do
    if [ -f $f ]; then
    STARTED=$((STARTED+1));
    NUMBER=$(cat $f | grep Tests | cut -d ' ' -f 5 | cut -d ',' -f 1)
    if [ "${NUMBER}" -gt "0" ];then
        # If any tests failed, fail the build
        echo "Tests failed for $f";
        return 1;
    fi
    fi
done
# If no tests were found fail the build.
if [ "${STARTED}" -eq "0" ];then
    echo "Tests did not run or were not found.";
    return 1;
fi;

echo "check-test-results.sh done!"
