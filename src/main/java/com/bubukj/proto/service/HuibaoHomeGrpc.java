package com.bubukj.proto.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import com.bubukj.proto.*;


/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: home.proto")
public final class HuibaoHomeGrpc {

  private HuibaoHomeGrpc() {}

  public static final String SERVICE_NAME = "HuibaoHome";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetHomeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<HomeRequest,
      Home> METHOD_GET_HOME = getGetHomeMethod();

  private static volatile io.grpc.MethodDescriptor<HomeRequest,
      Home> getGetHomeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<HomeRequest,
      Home> getGetHomeMethod() {
    io.grpc.MethodDescriptor<HomeRequest, Home> getGetHomeMethod;
    if ((getGetHomeMethod = HuibaoHomeGrpc.getGetHomeMethod) == null) {
      synchronized (HuibaoHomeGrpc.class) {
        if ((getGetHomeMethod = HuibaoHomeGrpc.getGetHomeMethod) == null) {
          HuibaoHomeGrpc.getGetHomeMethod = getGetHomeMethod = 
              io.grpc.MethodDescriptor.<HomeRequest, Home>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HuibaoHome", "GetHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Home.getDefaultInstance()))
                  .setSchemaDescriptor(new HuibaoHomeMethodDescriptorSupplier("GetHome"))
                  .build();
          }
        }
     }
     return getGetHomeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HuibaoHomeStub newStub(io.grpc.Channel channel) {
    return new HuibaoHomeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HuibaoHomeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HuibaoHomeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HuibaoHomeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HuibaoHomeFutureStub(channel);
  }

  /**
   */
  public static abstract class HuibaoHomeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHome(HomeRequest request,
        io.grpc.stub.StreamObserver<Home> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHomeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHomeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HomeRequest,
                Home>(
                  this, METHODID_GET_HOME)))
          .build();
    }
  }

  /**
   */
  public static final class HuibaoHomeStub extends io.grpc.stub.AbstractStub<HuibaoHomeStub> {
    private HuibaoHomeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HuibaoHomeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuibaoHomeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HuibaoHomeStub(channel, callOptions);
    }

    /**
     */
    public void getHome(HomeRequest request,
        io.grpc.stub.StreamObserver<Home> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHomeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HuibaoHomeBlockingStub extends io.grpc.stub.AbstractStub<HuibaoHomeBlockingStub> {
    private HuibaoHomeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HuibaoHomeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuibaoHomeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HuibaoHomeBlockingStub(channel, callOptions);
    }

    /**
     */
    public Home getHome(HomeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHomeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HuibaoHomeFutureStub extends io.grpc.stub.AbstractStub<HuibaoHomeFutureStub> {
    private HuibaoHomeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HuibaoHomeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuibaoHomeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HuibaoHomeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Home> getHome(
        HomeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHomeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HuibaoHomeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HuibaoHomeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOME:
          serviceImpl.getHome((HomeRequest) request,
              (io.grpc.stub.StreamObserver<Home>) responseObserver);
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

  private static abstract class HuibaoHomeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HuibaoHomeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HomeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HuibaoHome");
    }
  }

  private static final class HuibaoHomeFileDescriptorSupplier
      extends HuibaoHomeBaseDescriptorSupplier {
    HuibaoHomeFileDescriptorSupplier() {}
  }

  private static final class HuibaoHomeMethodDescriptorSupplier
      extends HuibaoHomeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HuibaoHomeMethodDescriptorSupplier(String methodName) {
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
      synchronized (HuibaoHomeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HuibaoHomeFileDescriptorSupplier())
              .addMethod(getGetHomeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
