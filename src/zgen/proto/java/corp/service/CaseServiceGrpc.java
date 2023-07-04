package corp.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: case-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CaseServiceGrpc {

  private CaseServiceGrpc() {}

  public static final String SERVICE_NAME = "corp.model.CaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<corp.model.Model.ById,
      corp.model.Model.Case> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = corp.model.Model.ById.class,
      responseType = corp.model.Model.Case.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Model.ById,
      corp.model.Model.Case> getGetMethod() {
    io.grpc.MethodDescriptor<corp.model.Model.ById, corp.model.Model.Case> getGetMethod;
    if ((getGetMethod = CaseServiceGrpc.getGetMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getGetMethod = CaseServiceGrpc.getGetMethod) == null) {
          CaseServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<corp.model.Model.ById, corp.model.Model.Case>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.ById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.Case.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Model.Case,
      corp.model.Model.Case> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = corp.model.Model.Case.class,
      responseType = corp.model.Model.Case.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Model.Case,
      corp.model.Model.Case> getCreateMethod() {
    io.grpc.MethodDescriptor<corp.model.Model.Case, corp.model.Model.Case> getCreateMethod;
    if ((getCreateMethod = CaseServiceGrpc.getCreateMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getCreateMethod = CaseServiceGrpc.getCreateMethod) == null) {
          CaseServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<corp.model.Model.Case, corp.model.Model.Case>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.Case.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.Case.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.model.Model.Case,
      corp.model.Model.Case> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = corp.model.Model.Case.class,
      responseType = corp.model.Model.Case.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.model.Model.Case,
      corp.model.Model.Case> getUpdateMethod() {
    io.grpc.MethodDescriptor<corp.model.Model.Case, corp.model.Model.Case> getUpdateMethod;
    if ((getUpdateMethod = CaseServiceGrpc.getUpdateMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getUpdateMethod = CaseServiceGrpc.getUpdateMethod) == null) {
          CaseServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<corp.model.Model.Case, corp.model.Model.Case>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.Case.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.Case.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      corp.model.Model.CaseList> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = corp.model.Model.CaseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      corp.model.Model.CaseList> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, corp.model.Model.CaseList> getGetAllMethod;
    if ((getGetAllMethod = CaseServiceGrpc.getGetAllMethod) == null) {
      synchronized (CaseServiceGrpc.class) {
        if ((getGetAllMethod = CaseServiceGrpc.getGetAllMethod) == null) {
          CaseServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, corp.model.Model.CaseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.model.Model.CaseList.getDefaultInstance()))
              .setSchemaDescriptor(new CaseServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceStub>() {
        @java.lang.Override
        public CaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceStub(channel, callOptions);
        }
      };
    return CaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceBlockingStub>() {
        @java.lang.Override
        public CaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceBlockingStub(channel, callOptions);
        }
      };
    return CaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CaseServiceFutureStub>() {
        @java.lang.Override
        public CaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CaseServiceFutureStub(channel, callOptions);
        }
      };
    return CaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(corp.model.Model.ById request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void create(corp.model.Model.Case request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void update(corp.model.Model.Case request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    default void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<corp.model.Model.CaseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CaseService.
   */
  public static abstract class CaseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CaseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CaseService.
   */
  public static final class CaseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CaseServiceStub> {
    private CaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(corp.model.Model.ById request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(corp.model.Model.Case request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(corp.model.Model.Case request,
        io.grpc.stub.StreamObserver<corp.model.Model.Case> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<corp.model.Model.CaseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CaseService.
   */
  public static final class CaseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CaseServiceBlockingStub> {
    private CaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public corp.model.Model.Case get(corp.model.Model.ById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.model.Model.Case create(corp.model.Model.Case request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.model.Model.Case update(corp.model.Model.Case request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public corp.model.Model.CaseList getAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CaseService.
   */
  public static final class CaseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CaseServiceFutureStub> {
    private CaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Model.Case> get(
        corp.model.Model.ById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Model.Case> create(
        corp.model.Model.Case request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Model.Case> update(
        corp.model.Model.Case request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *google.protobuf.Empty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.model.Model.CaseList> getAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_GET_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((corp.model.Model.ById) request,
              (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((corp.model.Model.Case) request,
              (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((corp.model.Model.Case) request,
              (io.grpc.stub.StreamObserver<corp.model.Model.Case>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<corp.model.Model.CaseList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Model.ById,
              corp.model.Model.Case>(
                service, METHODID_GET)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Model.Case,
              corp.model.Model.Case>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              corp.model.Model.Case,
              corp.model.Model.Case>(
                service, METHODID_UPDATE)))
        .addMethod(
          getGetAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              corp.model.Model.CaseList>(
                service, METHODID_GET_ALL)))
        .build();
  }

  private static abstract class CaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return corp.service.CaseServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CaseService");
    }
  }

  private static final class CaseServiceFileDescriptorSupplier
      extends CaseServiceBaseDescriptorSupplier {
    CaseServiceFileDescriptorSupplier() {}
  }

  private static final class CaseServiceMethodDescriptorSupplier
      extends CaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CaseServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CaseServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
