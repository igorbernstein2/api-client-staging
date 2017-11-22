// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/tracing.proto

package com.google.devtools.cloudtrace.v2;

public interface BatchWriteSpansRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the project where the spans belong. The format is
   * `projects/PROJECT_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the project where the spans belong. The format is
   * `projects/PROJECT_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  java.util.List<com.google.devtools.cloudtrace.v2.Span> 
      getSpansList();
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  com.google.devtools.cloudtrace.v2.Span getSpans(int index);
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  int getSpansCount();
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  java.util.List<? extends com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
      getSpansOrBuilderList();
  /**
   * <pre>
   * A collection of spans.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2;</code>
   */
  com.google.devtools.cloudtrace.v2.SpanOrBuilder getSpansOrBuilder(
      int index);
}