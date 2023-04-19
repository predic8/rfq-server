openapi-generator generate -g spring  -i https://raw.githubusercontent.com/predic8/rfq-api/main/rfq-api-v1.oas.yml  \
 --additional-properties=interfaceOnly=true;artifactId=rfq-server \
 -o .
