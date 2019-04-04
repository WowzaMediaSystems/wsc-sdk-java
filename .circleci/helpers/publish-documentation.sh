echo
echo "---===[ publish_docs.sh ]===---"
echo

: "${WSC_DOCS_BUCKET:?Need to set WSC_DOCS_BUCKET}"

echo "Copying target/apidocs/ directory to ${WSC_DOCS_BUCKET} bucket"

# Copy the generated docs to the server.
aws s3 cp target/apidocs/ s3://${WSC_DOCS_BUCKET}/resources/wsc/sdk/java/apidocs --recursive --acl public-read