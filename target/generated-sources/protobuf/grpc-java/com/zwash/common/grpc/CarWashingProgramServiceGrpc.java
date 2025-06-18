package com.zwash.common.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: car_washing_program.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarWashingProgramServiceGrpc {

  private CarWashingProgramServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.zwash.common.grpc.CarWashingProgramService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zwash.common.grpc.CarWashingProgramRequest,
      com.zwash.common.grpc.CarWashingProgramResponse> getGetCarWashingProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCarWashingProgram",
      requestType = com.zwash.common.grpc.CarWashingProgramRequest.class,
      responseType = com.zwash.common.grpc.CarWashingProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zwash.common.grpc.CarWashingProgramRequest,
      com.zwash.common.grpc.CarWashingProgramResponse> getGetCarWashingProgramMethod() {
    io.grpc.MethodDescriptor<com.zwash.common.grpc.CarWashingProgramRequest, com.zwash.common.grpc.CarWashingProgramResponse> getGetCarWashingProgramMethod;
    if ((getGetCarWashingProgramMethod = CarWashingProgramServiceGrpc.getGetCarWashingProgramMethod) == null) {
      synchronized (CarWashingProgramServiceGrpc.class) {
        if ((getGetCarWashingProgramMethod = CarWashingProgramServiceGrpc.getGetCarWashingProgramMethod) == null) {
          CarWashingProgramServiceGrpc.getGetCarWashingProgramMethod = getGetCarWashingProgramMethod =
              io.grpc.MethodDescriptor.<com.zwash.common.grpc.CarWashingProgramRequest, com.zwash.common.grpc.CarWashingProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCarWashingProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.CarWashingProgramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.CarWashingProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarWashingProgramServiceMethodDescriptorSupplier("GetCarWashingProgram"))
              .build();
        }
      }
    }
    return getGetCarWashingProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.zwash.common.grpc.CarWashingProgramListResponse> getGetAllCarWashingProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCarWashingPrograms",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.zwash.common.grpc.CarWashingProgramListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.zwash.common.grpc.CarWashingProgramListResponse> getGetAllCarWashingProgramsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.zwash.common.grpc.CarWashingProgramListResponse> getGetAllCarWashingProgramsMethod;
    if ((getGetAllCarWashingProgramsMethod = CarWashingProgramServiceGrpc.getGetAllCarWashingProgramsMethod) == null) {
      synchronized (CarWashingProgramServiceGrpc.class) {
        if ((getGetAllCarWashingProgramsMethod = CarWashingProgramServiceGrpc.getGetAllCarWashingProgramsMethod) == null) {
          CarWashingProgramServiceGrpc.getGetAllCarWashingProgramsMethod = getGetAllCarWashingProgramsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.zwash.common.grpc.CarWashingProgramListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCarWashingPrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.CarWashingProgramListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarWashingProgramServiceMethodDescriptorSupplier("GetAllCarWashingPrograms"))
              .build();
        }
      }
    }
    return getGetAllCarWashingProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zwash.common.grpc.GetWashingProgramRequest,
      com.zwash.common.grpc.CarWashingProgramResponse> getGetProgramByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProgramById",
      requestType = com.zwash.common.grpc.GetWashingProgramRequest.class,
      responseType = com.zwash.common.grpc.CarWashingProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zwash.common.grpc.GetWashingProgramRequest,
      com.zwash.common.grpc.CarWashingProgramResponse> getGetProgramByIdMethod() {
    io.grpc.MethodDescriptor<com.zwash.common.grpc.GetWashingProgramRequest, com.zwash.common.grpc.CarWashingProgramResponse> getGetProgramByIdMethod;
    if ((getGetProgramByIdMethod = CarWashingProgramServiceGrpc.getGetProgramByIdMethod) == null) {
      synchronized (CarWashingProgramServiceGrpc.class) {
        if ((getGetProgramByIdMethod = CarWashingProgramServiceGrpc.getGetProgramByIdMethod) == null) {
          CarWashingProgramServiceGrpc.getGetProgramByIdMethod = getGetProgramByIdMethod =
              io.grpc.MethodDescriptor.<com.zwash.common.grpc.GetWashingProgramRequest, com.zwash.common.grpc.CarWashingProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProgramById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.GetWashingProgramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.CarWashingProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarWashingProgramServiceMethodDescriptorSupplier("GetProgramById"))
              .build();
        }
      }
    }
    return getGetProgramByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarWashingProgramServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceStub>() {
        @java.lang.Override
        public CarWashingProgramServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarWashingProgramServiceStub(channel, callOptions);
        }
      };
    return CarWashingProgramServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarWashingProgramServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceBlockingStub>() {
        @java.lang.Override
        public CarWashingProgramServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarWashingProgramServiceBlockingStub(channel, callOptions);
        }
      };
    return CarWashingProgramServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarWashingProgramServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarWashingProgramServiceFutureStub>() {
        @java.lang.Override
        public CarWashingProgramServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarWashingProgramServiceFutureStub(channel, callOptions);
        }
      };
    return CarWashingProgramServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCarWashingProgram(com.zwash.common.grpc.CarWashingProgramRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarWashingProgramMethod(), responseObserver);
    }

    /**
     */
    default void getAllCarWashingPrograms(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCarWashingProgramsMethod(), responseObserver);
    }

    /**
     */
    default void getProgramById(com.zwash.common.grpc.GetWashingProgramRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProgramByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CarWashingProgramService.
   */
  public static abstract class CarWashingProgramServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CarWashingProgramServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CarWashingProgramService.
   */
  public static final class CarWashingProgramServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CarWashingProgramServiceStub> {
    private CarWashingProgramServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarWashingProgramServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarWashingProgramServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCarWashingProgram(com.zwash.common.grpc.CarWashingProgramRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarWashingProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCarWashingPrograms(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCarWashingProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProgramById(com.zwash.common.grpc.GetWashingProgramRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProgramByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CarWashingProgramService.
   */
  public static final class CarWashingProgramServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CarWashingProgramServiceBlockingStub> {
    private CarWashingProgramServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarWashingProgramServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarWashingProgramServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zwash.common.grpc.CarWashingProgramResponse getCarWashingProgram(com.zwash.common.grpc.CarWashingProgramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarWashingProgramMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zwash.common.grpc.CarWashingProgramListResponse getAllCarWashingPrograms(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCarWashingProgramsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zwash.common.grpc.CarWashingProgramResponse getProgramById(com.zwash.common.grpc.GetWashingProgramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProgramByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CarWashingProgramService.
   */
  public static final class CarWashingProgramServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CarWashingProgramServiceFutureStub> {
    private CarWashingProgramServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarWashingProgramServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarWashingProgramServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zwash.common.grpc.CarWashingProgramResponse> getCarWashingProgram(
        com.zwash.common.grpc.CarWashingProgramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarWashingProgramMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zwash.common.grpc.CarWashingProgramListResponse> getAllCarWashingPrograms(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCarWashingProgramsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zwash.common.grpc.CarWashingProgramResponse> getProgramById(
        com.zwash.common.grpc.GetWashingProgramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProgramByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAR_WASHING_PROGRAM = 0;
  private static final int METHODID_GET_ALL_CAR_WASHING_PROGRAMS = 1;
  private static final int METHODID_GET_PROGRAM_BY_ID = 2;

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
        case METHODID_GET_CAR_WASHING_PROGRAM:
          serviceImpl.getCarWashingProgram((com.zwash.common.grpc.CarWashingProgramRequest) request,
              (io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CAR_WASHING_PROGRAMS:
          serviceImpl.getAllCarWashingPrograms((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramListResponse>) responseObserver);
          break;
        case METHODID_GET_PROGRAM_BY_ID:
          serviceImpl.getProgramById((com.zwash.common.grpc.GetWashingProgramRequest) request,
              (io.grpc.stub.StreamObserver<com.zwash.common.grpc.CarWashingProgramResponse>) responseObserver);
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
          getGetCarWashingProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zwash.common.grpc.CarWashingProgramRequest,
              com.zwash.common.grpc.CarWashingProgramResponse>(
                service, METHODID_GET_CAR_WASHING_PROGRAM)))
        .addMethod(
          getGetAllCarWashingProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.zwash.common.grpc.CarWashingProgramListResponse>(
                service, METHODID_GET_ALL_CAR_WASHING_PROGRAMS)))
        .addMethod(
          getGetProgramByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zwash.common.grpc.GetWashingProgramRequest,
              com.zwash.common.grpc.CarWashingProgramResponse>(
                service, METHODID_GET_PROGRAM_BY_ID)))
        .build();
  }

  private static abstract class CarWashingProgramServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarWashingProgramServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zwash.common.grpc.CarWashingProgram.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarWashingProgramService");
    }
  }

  private static final class CarWashingProgramServiceFileDescriptorSupplier
      extends CarWashingProgramServiceBaseDescriptorSupplier {
    CarWashingProgramServiceFileDescriptorSupplier() {}
  }

  private static final class CarWashingProgramServiceMethodDescriptorSupplier
      extends CarWashingProgramServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CarWashingProgramServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CarWashingProgramServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarWashingProgramServiceFileDescriptorSupplier())
              .addMethod(getGetCarWashingProgramMethod())
              .addMethod(getGetAllCarWashingProgramsMethod())
              .addMethod(getGetProgramByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
