# onetme execution
# cd %GOPATH%\src
# git clone https://github.com/grpc-ecosystem/grpc-gateway.git
# go get github.com/grpc-ecosystem/grpc-gateway/..
go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway # For "allow_proto3_optional", ref: https://chromium.googlesource.com/external/github.com/protocolbuffers/protobuf/+/refs/tags/v3.13.0/docs/field_presence.md
cd $GOPATH/src/github.com/
# gopath => /Volumes/data01/projects/projects_go
PROJ_DIR=/Volumes/data01/projects/proj-corp/corp-model
INPUT_DIR=$PROJ_DIR/schema/proto
SRCGEN_DIR=$PROJ_DIR/src/zgen/proto/java
PROTOC_HOME=/usr/local/Cellar/protobuf/3.14.0
PROTOC_BIN=$PROTOC_HOME/bin/protoc
PROTOC_INCLUDE=$PROTOC_HOME/include:${GOPATH}/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis
PLUGIN_CONFIG=$PROTOC_HOME/protoc-gen-grpc-java-1.32.1
# set PROTOC_JAVA_BIN=C:\apps\google\protoc-3.13.0\bin\protoc-gen-grpc-java-1.32.1.exe

# Add this if OPtioal required --experimental_allow_proto3_optional
$PROTOC_BIN -I$PROTOC_INCLUDE\    --plugin=$PLUGIN_CONFIG --grpc-java_out=$SRCGEN_DIR --proto_path=$INPUT_DIR --java_out=$SRCGEN_DIR $INPUT_DIR/corp-service.proto $INPUT_DIR/corp-model.proto
#echo off
#echo !!!!!!!!!!!!!!!!!!!!!!!!! DO NOT FORGET !!!!!!!!!!!!!!!!!!!!!!!!!!
#echo !!                                                              !!
#echo !!  Add @JsonSerialize(using = SerializerGeneric.class)         !!
#echo !!      @JsonDeserialize(using = DeserializeSearchRequest.class)!!
#echo !!      public  static final class SearchRequest extends        !!
#echo !!                                                              !!
#echo !!!!!!!!!!!!!!!!! Add Json annotation to api objects     !!!!!!!!!
