

Steps To modify model objects:

1. Edit proto files - eg add model , or add se
2. Generate java source to src/zgen/java : 0_gen*.bat
3. Update dependent Proto project
   - Use the Proto Model classes classes
   - For quarkus: add to jandex lookup.
4. Update dependent Grpc project
   - Preferable: regenerate grpc services in that proj, by using url of person-service.proto
   - 


To create an app

mvn io.quarkus:quarkus-maven-plugin:{latest}.Final:create -DprojectGroupId=corp -DprojectArtifactId=corp-persion-grpc-rest -DprojectVersion=1.0.0 -DclassName="app.CoreResource"




Add this dependency to your pom

```xml
    <dependency>
      <groupId>corp</groupId>
      <artifactId>corp-model-protobuf</artifactId>
      <version>${corp-model.version}</version> <!-- 1.0.0-SNAPSHOT -->
    </dependency>
```

For quarkus bean registration add this to application.properties

```properties
quarkus.index-dependency.mygrpc.group-id=corp
quarkus.index-dependency.mygrpc.artifact-id=corp-model-protobuf
```