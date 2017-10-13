// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Configuration to suppress records whose suppression conditions evaluate to
 * true.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.RecordSuppression}
 */
public  final class RecordSuppression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.RecordSuppression)
    RecordSuppressionOrBuilder {
  // Use RecordSuppression.newBuilder() to construct.
  private RecordSuppression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordSuppression() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RecordSuppression(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2beta1.RecordCondition.Builder subBuilder = null;
            if (condition_ != null) {
              subBuilder = condition_.toBuilder();
            }
            condition_ = input.readMessage(com.google.privacy.dlp.v2beta1.RecordCondition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(condition_);
              condition_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_RecordSuppression_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_RecordSuppression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.RecordSuppression.class, com.google.privacy.dlp.v2beta1.RecordSuppression.Builder.class);
  }

  public static final int CONDITION_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta1.RecordCondition condition_;
  /**
   * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
   */
  public boolean hasCondition() {
    return condition_ != null;
  }
  /**
   * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.RecordCondition getCondition() {
    return condition_ == null ? com.google.privacy.dlp.v2beta1.RecordCondition.getDefaultInstance() : condition_;
  }
  /**
   * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.RecordConditionOrBuilder getConditionOrBuilder() {
    return getCondition();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (condition_ != null) {
      output.writeMessage(1, getCondition());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (condition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCondition());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.RecordSuppression)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.RecordSuppression other = (com.google.privacy.dlp.v2beta1.RecordSuppression) obj;

    boolean result = true;
    result = result && (hasCondition() == other.hasCondition());
    if (hasCondition()) {
      result = result && getCondition()
          .equals(other.getCondition());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCondition()) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getCondition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.RecordSuppression parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.RecordSuppression prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Configuration to suppress records whose suppression conditions evaluate to
   * true.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.RecordSuppression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.RecordSuppression)
      com.google.privacy.dlp.v2beta1.RecordSuppressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_RecordSuppression_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_RecordSuppression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.RecordSuppression.class, com.google.privacy.dlp.v2beta1.RecordSuppression.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.RecordSuppression.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (conditionBuilder_ == null) {
        condition_ = null;
      } else {
        condition_ = null;
        conditionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_RecordSuppression_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.RecordSuppression getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.RecordSuppression.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.RecordSuppression build() {
      com.google.privacy.dlp.v2beta1.RecordSuppression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.RecordSuppression buildPartial() {
      com.google.privacy.dlp.v2beta1.RecordSuppression result = new com.google.privacy.dlp.v2beta1.RecordSuppression(this);
      if (conditionBuilder_ == null) {
        result.condition_ = condition_;
      } else {
        result.condition_ = conditionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2beta1.RecordSuppression) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.RecordSuppression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.RecordSuppression other) {
      if (other == com.google.privacy.dlp.v2beta1.RecordSuppression.getDefaultInstance()) return this;
      if (other.hasCondition()) {
        mergeCondition(other.getCondition());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2beta1.RecordSuppression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.RecordSuppression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta1.RecordCondition condition_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.RecordCondition, com.google.privacy.dlp.v2beta1.RecordCondition.Builder, com.google.privacy.dlp.v2beta1.RecordConditionOrBuilder> conditionBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public boolean hasCondition() {
      return conditionBuilder_ != null || condition_ != null;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.RecordCondition getCondition() {
      if (conditionBuilder_ == null) {
        return condition_ == null ? com.google.privacy.dlp.v2beta1.RecordCondition.getDefaultInstance() : condition_;
      } else {
        return conditionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public Builder setCondition(com.google.privacy.dlp.v2beta1.RecordCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        condition_ = value;
        onChanged();
      } else {
        conditionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public Builder setCondition(
        com.google.privacy.dlp.v2beta1.RecordCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        condition_ = builderForValue.build();
        onChanged();
      } else {
        conditionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public Builder mergeCondition(com.google.privacy.dlp.v2beta1.RecordCondition value) {
      if (conditionBuilder_ == null) {
        if (condition_ != null) {
          condition_ =
            com.google.privacy.dlp.v2beta1.RecordCondition.newBuilder(condition_).mergeFrom(value).buildPartial();
        } else {
          condition_ = value;
        }
        onChanged();
      } else {
        conditionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public Builder clearCondition() {
      if (conditionBuilder_ == null) {
        condition_ = null;
        onChanged();
      } else {
        condition_ = null;
        conditionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.RecordCondition.Builder getConditionBuilder() {
      
      onChanged();
      return getConditionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.RecordConditionOrBuilder getConditionOrBuilder() {
      if (conditionBuilder_ != null) {
        return conditionBuilder_.getMessageOrBuilder();
      } else {
        return condition_ == null ?
            com.google.privacy.dlp.v2beta1.RecordCondition.getDefaultInstance() : condition_;
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.RecordCondition condition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.RecordCondition, com.google.privacy.dlp.v2beta1.RecordCondition.Builder, com.google.privacy.dlp.v2beta1.RecordConditionOrBuilder> 
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        conditionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.RecordCondition, com.google.privacy.dlp.v2beta1.RecordCondition.Builder, com.google.privacy.dlp.v2beta1.RecordConditionOrBuilder>(
                getCondition(),
                getParentForChildren(),
                isClean());
        condition_ = null;
      }
      return conditionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.RecordSuppression)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.RecordSuppression)
  private static final com.google.privacy.dlp.v2beta1.RecordSuppression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.RecordSuppression();
  }

  public static com.google.privacy.dlp.v2beta1.RecordSuppression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordSuppression>
      PARSER = new com.google.protobuf.AbstractParser<RecordSuppression>() {
    public RecordSuppression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecordSuppression(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordSuppression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordSuppression> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.RecordSuppression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

