#!/bin/bash

echo "manage-environment-pom.sh"

pom_locaton=~/pom.xml

CURRENT=$(date +%Y%m%d%H%M%S)
sed -i 's/BUILDEXTENDVERSION/$CURRENT/' ${pom_location}
