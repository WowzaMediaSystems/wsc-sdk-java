#!/bin/bash

# The context environment variable that contains the bundle
# WOWZA_CONTEXT_BUNDLE

echo "Debundling the WOWZA_CONTEXT_BUNDLE environment variable"

wcb_dir=~/.wowza-context-bundle

mkdir -p ${wcb_dir}

echo $WOWZA_CONTEXT_BUNDLE | base64 --decode | sed -e 's/^/export /' >  ${wcb_dir}/exports.sh

.  ${wcb_dir}/exports.sh