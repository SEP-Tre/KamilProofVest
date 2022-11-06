package sep3.rightovers.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Rightovers.proto")
public final class RightOversServiceGrpc {

  private RightOversServiceGrpc() {}

  public static final String SERVICE_NAME = "rightovers.grpc.RightOversService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sep3.rightovers.protobuf.FoodPostRequest,
      sep3.rightovers.protobuf.FoodPostCreatedResponse> getSaveFoodPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveFoodPost",
      requestType = sep3.rightovers.protobuf.FoodPostRequest.class,
      responseType = sep3.rightovers.protobuf.FoodPostCreatedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sep3.rightovers.protobuf.FoodPostRequest,
      sep3.rightovers.protobuf.FoodPostCreatedResponse> getSaveFoodPostMethod() {
    io.grpc.MethodDescriptor<sep3.rightovers.protobuf.FoodPostRequest, sep3.rightovers.protobuf.FoodPostCreatedResponse> getSaveFoodPostMethod;
    if ((getSaveFoodPostMethod = RightOversServiceGrpc.getSaveFoodPostMethod) == null) {
      synchronized (RightOversServiceGrpc.class) {
        if ((getSaveFoodPostMethod = RightOversServiceGrpc.getSaveFoodPostMethod) == null) {
          RightOversServiceGrpc.getSaveFoodPostMethod = getSaveFoodPostMethod =
              io.grpc.MethodDescriptor.<sep3.rightovers.protobuf.FoodPostRequest, sep3.rightovers.protobuf.FoodPostCreatedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveFoodPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.rightovers.protobuf.FoodPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.rightovers.protobuf.FoodPostCreatedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RightOversServiceMethodDescriptorSupplier("saveFoodPost"))
              .build();
        }
      }
    }
    return getSaveFoodPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sep3.rightovers.protobuf.GetAllRequest,
      sep3.rightovers.protobuf.GetAllResponse> getGetAllFoodPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFoodPosts",
      requestType = sep3.rightovers.protobuf.GetAllRequest.class,
      responseType = sep3.rightovers.protobuf.GetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sep3.rightovers.protobuf.GetAllRequest,
      sep3.rightovers.protobuf.GetAllResponse> getGetAllFoodPostsMethod() {
    io.grpc.MethodDescriptor<sep3.rightovers.protobuf.GetAllRequest, sep3.rightovers.protobuf.GetAllResponse> getGetAllFoodPostsMethod;
    if ((getGetAllFoodPostsMethod = RightOversServiceGrpc.getGetAllFoodPostsMethod) == null) {
      synchronized (RightOversServiceGrpc.class) {
        if ((getGetAllFoodPostsMethod = RightOversServiceGrpc.getGetAllFoodPostsMethod) == null) {
          RightOversServiceGrpc.getGetAllFoodPostsMethod = getGetAllFoodPostsMethod =
              io.grpc.MethodDescriptor.<sep3.rightovers.protobuf.GetAllRequest, sep3.rightovers.protobuf.GetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllFoodPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.rightovers.protobuf.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sep3.rightovers.protobuf.GetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RightOversServiceMethodDescriptorSupplier("getAllFoodPosts"))
              .build();
        }
      }
    }
    return getGetAllFoodPostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RightOversServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RightOversServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RightOversServiceStub>() {
        @java.lang.Override
        public RightOversServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RightOversServiceStub(channel, callOptions);
        }
      };
    return RightOversServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RightOversServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RightOversServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RightOversServiceBlockingStub>() {
        @java.lang.Override
        public RightOversServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RightOversServiceBlockingStub(channel, callOptions);
        }
      };
    return RightOversServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RightOversServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RightOversServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RightOversServiceFutureStub>() {
        @java.lang.Override
        public RightOversServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RightOversServiceFutureStub(channel, callOptions);
        }
      };
    return RightOversServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RightOversServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveFoodPost(sep3.rightovers.protobuf.FoodPostRequest request,
        io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.FoodPostCreatedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFoodPostMethod(), responseObserver);
    }

    /**
     */
    public void getAllFoodPosts(sep3.rightovers.protobuf.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.GetAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFoodPostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveFoodPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sep3.rightovers.protobuf.FoodPostRequest,
                sep3.rightovers.protobuf.FoodPostCreatedResponse>(
                  this, METHODID_SAVE_FOOD_POST)))
          .addMethod(
            getGetAllFoodPostsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sep3.rightovers.protobuf.GetAllRequest,
                sep3.rightovers.protobuf.GetAllResponse>(
                  this, METHODID_GET_ALL_FOOD_POSTS)))
          .build();
    }
  }

  /**
   */
  public static final class RightOversServiceStub extends io.grpc.stub.AbstractAsyncStub<RightOversServiceStub> {
    private RightOversServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RightOversServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RightOversServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveFoodPost(sep3.rightovers.protobuf.FoodPostRequest request,
        io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.FoodPostCreatedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFoodPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFoodPosts(sep3.rightovers.protobuf.GetAllRequest request,
        io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.GetAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllFoodPostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RightOversServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RightOversServiceBlockingStub> {
    private RightOversServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RightOversServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RightOversServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sep3.rightovers.protobuf.FoodPostCreatedResponse saveFoodPost(sep3.rightovers.protobuf.FoodPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFoodPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sep3.rightovers.protobuf.GetAllResponse> getAllFoodPosts(
        sep3.rightovers.protobuf.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllFoodPostsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RightOversServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RightOversServiceFutureStub> {
    private RightOversServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RightOversServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RightOversServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sep3.rightovers.protobuf.FoodPostCreatedResponse> saveFoodPost(
        sep3.rightovers.protobuf.FoodPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFoodPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_FOOD_POST = 0;
  private static final int METHODID_GET_ALL_FOOD_POSTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RightOversServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RightOversServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_FOOD_POST:
          serviceImpl.saveFoodPost((sep3.rightovers.protobuf.FoodPostRequest) request,
              (io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.FoodPostCreatedResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FOOD_POSTS:
          serviceImpl.getAllFoodPosts((sep3.rightovers.protobuf.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<sep3.rightovers.protobuf.GetAllResponse>) responseObserver);
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

  private static abstract class RightOversServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RightOversServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sep3.rightovers.protobuf.Rightovers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RightOversService");
    }
  }

  private static final class RightOversServiceFileDescriptorSupplier
      extends RightOversServiceBaseDescriptorSupplier {
    RightOversServiceFileDescriptorSupplier() {}
  }

  private static final class RightOversServiceMethodDescriptorSupplier
      extends RightOversServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RightOversServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RightOversServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RightOversServiceFileDescriptorSupplier())
              .addMethod(getSaveFoodPostMethod())
              .addMethod(getGetAllFoodPostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
