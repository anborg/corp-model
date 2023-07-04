https://stackoverflow.com/questions/43313186/how-to-import-grpc-empty-and-google-api-annotations-proto

mkdir -p google/api
wget https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/annotations.proto > google/api/annotations.proto
wget https://raw.githubusercontent.com/googleapis/googleapis/master/google/api/http.proto > google/api/http.proto

python -m grpc_tools.protoc google/api/http.proto google/api/annotations.proto -I. --python_out=. --grpc_python_out=. your_proto.proto



# To generate openapi file

go get github.com/googleapis/gnostic/...
go install github.com/googleapis/gnostic/apps/protoc-gen-openapi

protoc muni-service.proto -I. --openapi_out=.