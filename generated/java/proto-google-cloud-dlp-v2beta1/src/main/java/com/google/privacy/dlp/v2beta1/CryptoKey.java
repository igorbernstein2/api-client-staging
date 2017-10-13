// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * This is a data encryption key (DEK) (as opposed to
 * a key encryption key (KEK) stored by KMS).
 * When using KMS to wrap/unwrap DEKs, be sure to set an appropriate
 * IAM policy on the KMS CryptoKey (KEK) to ensure an attacker cannot
 * unwrap the data crypto key.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.CryptoKey}
 */
public  final class CryptoKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.CryptoKey)
    CryptoKeyOrBuilder {
  // Use CryptoKey.newBuilder() to construct.
  private CryptoKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CryptoKey() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CryptoKey(
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
            com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder subBuilder = null;
            if (sourceCase_ == 1) {
              subBuilder = ((com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.google.privacy.dlp.v2beta1.TransientCryptoKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 1;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder subBuilder = null;
            if (sourceCase_ == 2) {
              subBuilder = ((com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 2;
            break;
          }
          case 26: {
            com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder subBuilder = null;
            if (sourceCase_ == 3) {
              subBuilder = ((com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 3;
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
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_CryptoKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_CryptoKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.CryptoKey.class, com.google.privacy.dlp.v2beta1.CryptoKey.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite {
    TRANSIENT(1),
    UNWRAPPED(2),
    KMS_WRAPPED(3),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return TRANSIENT;
        case 2: return UNWRAPPED;
        case 3: return KMS_WRAPPED;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int TRANSIENT_FIELD_NUMBER = 1;
  /**
   * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.TransientCryptoKey getTransient() {
    if (sourceCase_ == 1) {
       return (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
  }
  /**
   * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.TransientCryptoKeyOrBuilder getTransientOrBuilder() {
    if (sourceCase_ == 1) {
       return (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
  }

  public static final int UNWRAPPED_FIELD_NUMBER = 2;
  /**
   * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
   */
  public com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey getUnwrapped() {
    if (sourceCase_ == 2) {
       return (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
  }
  /**
   * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
   */
  public com.google.privacy.dlp.v2beta1.UnwrappedCryptoKeyOrBuilder getUnwrappedOrBuilder() {
    if (sourceCase_ == 2) {
       return (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
  }

  public static final int KMS_WRAPPED_FIELD_NUMBER = 3;
  /**
   * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   */
  public com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey getKmsWrapped() {
    if (sourceCase_ == 3) {
       return (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
  }
  /**
   * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   */
  public com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKeyOrBuilder getKmsWrappedOrBuilder() {
    if (sourceCase_ == 3) {
       return (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_;
    }
    return com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_);
    }
    if (sourceCase_ == 3) {
      output.writeMessage(3, (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.CryptoKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.CryptoKey other = (com.google.privacy.dlp.v2beta1.CryptoKey) obj;

    boolean result = true;
    result = result && getSourceCase().equals(
        other.getSourceCase());
    if (!result) return false;
    switch (sourceCase_) {
      case 1:
        result = result && getTransient()
            .equals(other.getTransient());
        break;
      case 2:
        result = result && getUnwrapped()
            .equals(other.getUnwrapped());
        break;
      case 3:
        result = result && getKmsWrapped()
            .equals(other.getKmsWrapped());
        break;
      case 0:
      default:
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + TRANSIENT_FIELD_NUMBER;
        hash = (53 * hash) + getTransient().hashCode();
        break;
      case 2:
        hash = (37 * hash) + UNWRAPPED_FIELD_NUMBER;
        hash = (53 * hash) + getUnwrapped().hashCode();
        break;
      case 3:
        hash = (37 * hash) + KMS_WRAPPED_FIELD_NUMBER;
        hash = (53 * hash) + getKmsWrapped().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.CryptoKey parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.CryptoKey prototype) {
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
   * This is a data encryption key (DEK) (as opposed to
   * a key encryption key (KEK) stored by KMS).
   * When using KMS to wrap/unwrap DEKs, be sure to set an appropriate
   * IAM policy on the KMS CryptoKey (KEK) to ensure an attacker cannot
   * unwrap the data crypto key.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.CryptoKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.CryptoKey)
      com.google.privacy.dlp.v2beta1.CryptoKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_CryptoKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_CryptoKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.CryptoKey.class, com.google.privacy.dlp.v2beta1.CryptoKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.CryptoKey.newBuilder()
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
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_CryptoKey_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.CryptoKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.CryptoKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.CryptoKey build() {
      com.google.privacy.dlp.v2beta1.CryptoKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.CryptoKey buildPartial() {
      com.google.privacy.dlp.v2beta1.CryptoKey result = new com.google.privacy.dlp.v2beta1.CryptoKey(this);
      if (sourceCase_ == 1) {
        if (transientBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = transientBuilder_.build();
        }
      }
      if (sourceCase_ == 2) {
        if (unwrappedBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = unwrappedBuilder_.build();
        }
      }
      if (sourceCase_ == 3) {
        if (kmsWrappedBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = kmsWrappedBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.privacy.dlp.v2beta1.CryptoKey) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.CryptoKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.CryptoKey other) {
      if (other == com.google.privacy.dlp.v2beta1.CryptoKey.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case TRANSIENT: {
          mergeTransient(other.getTransient());
          break;
        }
        case UNWRAPPED: {
          mergeUnwrapped(other.getUnwrapped());
          break;
        }
        case KMS_WRAPPED: {
          mergeKmsWrapped(other.getKmsWrapped());
          break;
        }
        case SOURCE_NOT_SET: {
          break;
        }
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
      com.google.privacy.dlp.v2beta1.CryptoKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.CryptoKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.TransientCryptoKey, com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder, com.google.privacy.dlp.v2beta1.TransientCryptoKeyOrBuilder> transientBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.TransientCryptoKey getTransient() {
      if (transientBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return transientBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public Builder setTransient(com.google.privacy.dlp.v2beta1.TransientCryptoKey value) {
      if (transientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        transientBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public Builder setTransient(
        com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder builderForValue) {
      if (transientBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        transientBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public Builder mergeTransient(com.google.privacy.dlp.v2beta1.TransientCryptoKey value) {
      if (transientBuilder_ == null) {
        if (sourceCase_ == 1 &&
            source_ != com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance()) {
          source_ = com.google.privacy.dlp.v2beta1.TransientCryptoKey.newBuilder((com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          transientBuilder_.mergeFrom(value);
        }
        transientBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public Builder clearTransient() {
      if (transientBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        transientBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder getTransientBuilder() {
      return getTransientFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.TransientCryptoKeyOrBuilder getTransientOrBuilder() {
      if ((sourceCase_ == 1) && (transientBuilder_ != null)) {
        return transientBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.TransientCryptoKey transient = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.TransientCryptoKey, com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder, com.google.privacy.dlp.v2beta1.TransientCryptoKeyOrBuilder> 
        getTransientFieldBuilder() {
      if (transientBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.privacy.dlp.v2beta1.TransientCryptoKey.getDefaultInstance();
        }
        transientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.TransientCryptoKey, com.google.privacy.dlp.v2beta1.TransientCryptoKey.Builder, com.google.privacy.dlp.v2beta1.TransientCryptoKeyOrBuilder>(
                (com.google.privacy.dlp.v2beta1.TransientCryptoKey) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();;
      return transientBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKeyOrBuilder> unwrappedBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey getUnwrapped() {
      if (unwrappedBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return unwrappedBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public Builder setUnwrapped(com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey value) {
      if (unwrappedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        unwrappedBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public Builder setUnwrapped(
        com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder builderForValue) {
      if (unwrappedBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        unwrappedBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public Builder mergeUnwrapped(com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey value) {
      if (unwrappedBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance()) {
          source_ = com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.newBuilder((com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          unwrappedBuilder_.mergeFrom(value);
        }
        unwrappedBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public Builder clearUnwrapped() {
      if (unwrappedBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        unwrappedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder getUnwrappedBuilder() {
      return getUnwrappedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    public com.google.privacy.dlp.v2beta1.UnwrappedCryptoKeyOrBuilder getUnwrappedOrBuilder() {
      if ((sourceCase_ == 2) && (unwrappedBuilder_ != null)) {
        return unwrappedBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.UnwrappedCryptoKey unwrapped = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKeyOrBuilder> 
        getUnwrappedFieldBuilder() {
      if (unwrappedBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.getDefaultInstance();
        }
        unwrappedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.UnwrappedCryptoKeyOrBuilder>(
                (com.google.privacy.dlp.v2beta1.UnwrappedCryptoKey) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();;
      return unwrappedBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKeyOrBuilder> kmsWrappedBuilder_;
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey getKmsWrapped() {
      if (kmsWrappedBuilder_ == null) {
        if (sourceCase_ == 3) {
          return (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
      } else {
        if (sourceCase_ == 3) {
          return kmsWrappedBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public Builder setKmsWrapped(com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey value) {
      if (kmsWrappedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        kmsWrappedBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public Builder setKmsWrapped(
        com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder builderForValue) {
      if (kmsWrappedBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        kmsWrappedBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public Builder mergeKmsWrapped(com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey value) {
      if (kmsWrappedBuilder_ == null) {
        if (sourceCase_ == 3 &&
            source_ != com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance()) {
          source_ = com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.newBuilder((com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 3) {
          kmsWrappedBuilder_.mergeFrom(value);
        }
        kmsWrappedBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public Builder clearKmsWrapped() {
      if (kmsWrappedBuilder_ == null) {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
        }
        kmsWrappedBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder getKmsWrappedBuilder() {
      return getKmsWrappedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    public com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKeyOrBuilder getKmsWrappedOrBuilder() {
      if ((sourceCase_ == 3) && (kmsWrappedBuilder_ != null)) {
        return kmsWrappedBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 3) {
          return (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_;
        }
        return com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
      }
    }
    /**
     * <code>.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKeyOrBuilder> 
        getKmsWrappedFieldBuilder() {
      if (kmsWrappedBuilder_ == null) {
        if (!(sourceCase_ == 3)) {
          source_ = com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.getDefaultInstance();
        }
        kmsWrappedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey.Builder, com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKeyOrBuilder>(
                (com.google.privacy.dlp.v2beta1.KmsWrappedCryptoKey) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 3;
      onChanged();;
      return kmsWrappedBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.CryptoKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.CryptoKey)
  private static final com.google.privacy.dlp.v2beta1.CryptoKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.CryptoKey();
  }

  public static com.google.privacy.dlp.v2beta1.CryptoKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CryptoKey>
      PARSER = new com.google.protobuf.AbstractParser<CryptoKey>() {
    public CryptoKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CryptoKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CryptoKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CryptoKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.CryptoKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

