package com.zwash.common.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: service_provider.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceProviderServiceGrpc {

  private ServiceProviderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.zwash.common.grpc.ServiceProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zwash.common.grpc.ServiceProviderRequest,
      com.zwash.common.grpc.ServiceProviderResponse> getGetServiceProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceProvider",
      requestType = com.zwash.common.grpc.ServiceProviderRequest.class,
      responseType = com.zwash.common.grpc.ServiceProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zwash.common.grpc.ServiceProviderRequest,
      com.zwash.common.grpc.ServiceProviderResponse> getGetServiceProviderMethod() {
    io.grpc.MethodDescriptor<com.zwash.common.grpc.ServiceProviderRequest, com.zwash.common.grpc.ServiceProviderResponse> getGetServiceProviderMethod;
    if ((getGetServiceProviderMethod = ServiceProviderServiceGrpc.getGetServiceProviderMethod) == null) {
      synchronized (ServiceProviderServiceGrpc.class) {
        if ((getGetServiceProviderMethod = ServiceProviderServiceGrpc.getGetServiceProviderMethod) == null) {
          ServiceProviderServiceGrpc.getGetServiceProviderMethod = getGetServiceProviderMethod =
              io.grpc.MethodDescriptor.<com.zwash.common.grpc.ServiceProviderRequest, com.zwash.common.grpc.ServiceProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.ServiceProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.ServiceProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceProviderServiceMethodDescriptorSupplier("GetServiceProvider"))
              .build();
        }
      }
    }
    return getGetServiceProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.zwash.common.grpc.ServiceProviderListResponse> getGetAllServiceProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllServiceProviders",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.zwash.common.grpc.ServiceProviderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.zwash.common.grpc.ServiceProviderListResponse> getGetAllServiceProvidersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.zwash.common.grpc.ServiceProviderListResponse> getGetAllServiceProvidersMethod;
    if ((getGetAllServiceProvidersMethod = ServiceProviderServiceGrpc.getGetAllServiceProvidersMethod) == null) {
      synchronized (ServiceProviderServiceGrpc.class) {
        if ((getGetAllServiceProvidersMethod = ServiceProviderServiceGrpc.getGetAllServiceProvidersMethod) == null) {
          ServiceProviderServiceGrpc.getGetAllServiceProvidersMethod = getGetAllServiceProvidersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.zwash.common.grpc.ServiceProviderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllServiceProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zwash.common.grpc.ServiceProviderListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceProviderServiceMethodDescriptorSupplier("GetAllServiceProviders"))
              .build();
        }
      }
    }
    return getGetAllServiceProvidersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceProviderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceStub>() {
        @java.lang.Override
        public ServiceProviderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceProviderServiceStub(channel, callOptions);
        }
      };
    return ServiceProviderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceBlockingStub>() {
        @java.lang.Override
        public ServiceProviderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceProviderServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceProviderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceProviderServiceFutureStub>() {
        @java.lang.Override
        public ServiceProviderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceProviderServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceProviderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getServiceProvider(com.zwash.common.grpc.ServiceProviderRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceProviderMethod(), responseObserver);
    }

    /**
     */
    default void getAllServiceProviders(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllServiceProvidersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceProviderService.
   */
  public static abstract class ServiceProviderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceProviderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceProviderService.
   */
  public static final class ServiceProviderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceProviderServiceStub> {
    private ServiceProviderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceProviderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceProviderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getServiceProvider(com.zwash.common.grpc.ServiceProviderRequest request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllServiceProviders(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllServiceProvidersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceProviderService.
   */
  public static final class ServiceProviderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceProviderServiceBlockingStub> {
    private ServiceProviderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceProviderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zwash.common.grpc.ServiceProviderResponse getServiceProvider(com.zwash.common.grpc.ServiceProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zwash.common.grpc.ServiceProviderListResponse getAllServiceProviders(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllServiceProvidersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceProviderService.
   */
  public static final class ServiceProviderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceProviderServiceFutureStub> {
    private ServiceProviderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceProviderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceProviderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zwash.common.grpc.ServiceProviderResponse> getServiceProvider(
        com.zwash.common.grpc.ServiceProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zwash.common.grpc.ServiceProviderListResponse> getAllServiceProviders(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllServiceProvidersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE_PROVIDER = 0;
  private static final int METHODID_GET_ALL_SERVICE_PROVIDERS = 1;

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
        case METHODID_GET_SERVICE_PROVIDER:
          serviceImpl.getServiceProvider((com.zwash.common.grpc.ServiceProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_SERVICE_PROVIDERS:
          serviceImpl.getAllServiceProviders((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.zwash.common.grpc.ServiceProviderListResponse>) responseObserver);
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
          getGetServiceProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zwash.common.grpc.ServiceProviderRequest,
              com.zwash.common.grpc.ServiceProviderResponse>(
                service, METHODID_GET_SERVICE_PROVIDER)))
        .addMethod(
          getGetAllServiceProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.zwash.common.grpc.ServiceProviderListResponse>(
                service, METHODID_GET_ALL_SERVICE_PROVIDERS)))
        .build();
  }

  private static abstract class ServiceProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zwash.common.grpc.ServiceProviderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceProviderService");
    }
  }

  private static final class ServiceProviderServiceFileDescriptorSupplier
      extends ServiceProviderServiceBaseDescriptorSupplier {
    ServiceProviderServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceProviderServiceMethodDescriptorSupplier
      extends ServiceProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceProviderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceProviderServiceFileDescriptorSupplier())
              .addMethod(getGetServiceProviderMethod())
              .addMethod(getGetAllServiceProvidersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
