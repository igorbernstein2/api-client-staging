package com.google.cloud.dialogflow.v2beta1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Manages user sessions.
 * Custom methods.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/cloud/dialogflow/v2beta1/session.proto")
public final class SessionsGrpc {

  private SessionsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.dialogflow.v2beta1.Sessions";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,
      com.google.cloud.dialogflow.v2beta1.DetectIntentResponse> METHOD_DETECT_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Sessions", "DetectIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DetectIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.DetectIntentResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,
      com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse> METHOD_STREAMING_DETECT_INTENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "google.cloud.dialogflow.v2beta1.Sessions", "StreamingDetectIntent"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionsStub newStub(io.grpc.Channel channel) {
    return new SessionsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SessionsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SessionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SessionsFutureStub(channel);
  }

  /**
   * <pre>
   * Manages user sessions.
   * Custom methods.
   * </pre>
   */
  public static abstract class SessionsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public void detectIntent(com.google.cloud.dialogflow.v2beta1.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.DetectIntentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DETECT_INTENT, responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query in audio format in a streaming fashion
     * and returns structured, actionable data as a result. This method is only
     * available via the gRPC API (not REST).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest> streamingDetectIntent(
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_STREAMING_DETECT_INTENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DETECT_INTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.DetectIntentRequest,
                com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>(
                  this, METHODID_DETECT_INTENT)))
          .addMethod(
            METHOD_STREAMING_DETECT_INTENT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest,
                com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>(
                  this, METHODID_STREAMING_DETECT_INTENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages user sessions.
   * Custom methods.
   * </pre>
   */
  public static final class SessionsStub extends io.grpc.stub.AbstractStub<SessionsStub> {
    private SessionsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public void detectIntent(com.google.cloud.dialogflow.v2beta1.DetectIntentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.DetectIntentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DETECT_INTENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Processes a natural language query in audio format in a streaming fashion
     * and returns structured, actionable data as a result. This method is only
     * available via the gRPC API (not REST).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest> streamingDetectIntent(
        io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_STREAMING_DETECT_INTENT, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Manages user sessions.
   * Custom methods.
   * </pre>
   */
  public static final class SessionsBlockingStub extends io.grpc.stub.AbstractStub<SessionsBlockingStub> {
    private SessionsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public com.google.cloud.dialogflow.v2beta1.DetectIntentResponse detectIntent(com.google.cloud.dialogflow.v2beta1.DetectIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DETECT_INTENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages user sessions.
   * Custom methods.
   * </pre>
   */
  public static final class SessionsFutureStub extends io.grpc.stub.AbstractStub<SessionsFutureStub> {
    private SessionsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SessionsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SessionsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a natural language query and returns structured, actionable data
     * as a result. This method is not idempotent, because it may cause contexts
     * and session entity types to be updated, which in turn might affect
     * results of future queries.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.dialogflow.v2beta1.DetectIntentResponse> detectIntent(
        com.google.cloud.dialogflow.v2beta1.DetectIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DETECT_INTENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_INTENT = 0;
  private static final int METHODID_STREAMING_DETECT_INTENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT_INTENT:
          serviceImpl.detectIntent((com.google.cloud.dialogflow.v2beta1.DetectIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.DetectIntentResponse>) responseObserver);
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
        case METHODID_STREAMING_DETECT_INTENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingDetectIntent(
              (io.grpc.stub.StreamObserver<com.google.cloud.dialogflow.v2beta1.StreamingDetectIntentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class SessionsDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.SessionProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SessionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionsDescriptorSupplier())
              .addMethod(METHOD_DETECT_INTENT)
              .addMethod(METHOD_STREAMING_DETECT_INTENT)
              .build();
        }
      }
    }
    return result;
  }
}
