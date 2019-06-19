#!/bin/bash

echo "manage-environment-pom.sh"

# Update version to be built
# Each version built has a build date/time added so to be
# consistent with other products built - support can see when
# the targets were built - rather than relying on some 'variable'
# build counter.

pom_location=pom.xml

CURRENT_VERSION=1.3.1
CURRENT=${CURRENT_VERSION}-$(date +%Y%m%d%H%M%S)

sed -i "s/BUILDEXTENDVERSION/${CURRENT}/" ${pom_location}
