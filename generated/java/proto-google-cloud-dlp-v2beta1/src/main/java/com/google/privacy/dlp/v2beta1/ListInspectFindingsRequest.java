// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Request for the list of results in a given inspect operation.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.ListInspectFindingsRequest}
 */
public  final class ListInspectFindingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.ListInspectFindingsRequest)
    ListInspectFindingsRequestOrBuilder {
  // Use ListInspectFindingsRequest.newBuilder() to construct.
  private ListInspectFindingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInspectFindingsRequest() {
    name_ = "";
    pageSize_ = 0;
    pageToken_ = "";
    filter_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListInspectFindingsRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
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
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListInspectFindingsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListInspectFindingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.class, com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Identifier of the results set returned as metadata of
   * the longrunning operation created by a call to InspectDataSource.
   * Should be in the format of `inspect/results/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Identifier of the results set returned as metadata of
   * the longrunning operation created by a call to InspectDataSource.
   * Should be in the format of `inspect/results/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * Maximum number of results to return.
   * If 0, the implementation selects a reasonable value.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * The value returned by the last `ListInspectFindingsResponse`; indicates
   * that this is a continuation of a prior `ListInspectFindings` call, and that
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The value returned by the last `ListInspectFindingsResponse`; indicates
   * that this is a continuation of a prior `ListInspectFindings` call, and that
   * the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 4;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * Restricts findings to items that match. Supports info_type and likelihood.
   * Examples:
   * - info_type=EMAIL_ADDRESS
   * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
   * - likelihood=VERY_LIKELY
   * - likelihood=VERY_LIKELY,LIKELY
   * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
   * </pre>
   *
   * <code>string filter = 4;</code>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Restricts findings to items that match. Supports info_type and likelihood.
   * Examples:
   * - info_type=EMAIL_ADDRESS
   * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
   * - likelihood=VERY_LIKELY
   * - likelihood=VERY_LIKELY,LIKELY
   * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
   * </pre>
   *
   * <code>string filter = 4;</code>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, filter_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, filter_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest other = (com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && getFilter()
        .equals(other.getFilter());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest prototype) {
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
   * Request for the list of results in a given inspect operation.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.ListInspectFindingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.ListInspectFindingsRequest)
      com.google.privacy.dlp.v2beta1.ListInspectFindingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListInspectFindingsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListInspectFindingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.class, com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.newBuilder()
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
      name_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      filter_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListInspectFindingsRequest_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest build() {
      com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest buildPartial() {
      com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest result = new com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest(this);
      result.name_ = name_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      result.filter_ = filter_;
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
      if (other instanceof com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest other) {
      if (other == com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
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
      com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to InspectDataSource.
     * Should be in the format of `inspect/results/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to InspectDataSource.
     * Should be in the format of `inspect/results/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to InspectDataSource.
     * Should be in the format of `inspect/results/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to InspectDataSource.
     * Should be in the format of `inspect/results/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifier of the results set returned as metadata of
     * the longrunning operation created by a call to InspectDataSource.
     * Should be in the format of `inspect/results/{id}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of results to return.
     * If 0, the implementation selects a reasonable value.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value returned by the last `ListInspectFindingsResponse`; indicates
     * that this is a continuation of a prior `ListInspectFindings` call, and that
     * the system should return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * Restricts findings to items that match. Supports info_type and likelihood.
     * Examples:
     * - info_type=EMAIL_ADDRESS
     * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * - likelihood=VERY_LIKELY
     * - likelihood=VERY_LIKELY,LIKELY
     * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     * </pre>
     *
     * <code>string filter = 4;</code>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Restricts findings to items that match. Supports info_type and likelihood.
     * Examples:
     * - info_type=EMAIL_ADDRESS
     * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * - likelihood=VERY_LIKELY
     * - likelihood=VERY_LIKELY,LIKELY
     * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     * </pre>
     *
     * <code>string filter = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Restricts findings to items that match. Supports info_type and likelihood.
     * Examples:
     * - info_type=EMAIL_ADDRESS
     * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * - likelihood=VERY_LIKELY
     * - likelihood=VERY_LIKELY,LIKELY
     * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     * </pre>
     *
     * <code>string filter = 4;</code>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts findings to items that match. Supports info_type and likelihood.
     * Examples:
     * - info_type=EMAIL_ADDRESS
     * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * - likelihood=VERY_LIKELY
     * - likelihood=VERY_LIKELY,LIKELY
     * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     * </pre>
     *
     * <code>string filter = 4;</code>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts findings to items that match. Supports info_type and likelihood.
     * Examples:
     * - info_type=EMAIL_ADDRESS
     * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
     * - likelihood=VERY_LIKELY
     * - likelihood=VERY_LIKELY,LIKELY
     * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
     * </pre>
     *
     * <code>string filter = 4;</code>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    public final Builder setNameWithResultName(com.google.privacy.dlp.v2beta1.ResultName value) {
      if (value == null) {
        return setName("");
      }
      return setName(value.toString());
    }
    
    public final com.google.privacy.dlp.v2beta1.ResultName getNameAsResultName() {
      java.lang.String str = getName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.privacy.dlp.v2beta1.ResultName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.ListInspectFindingsRequest)
  }

  public final com.google.privacy.dlp.v2beta1.ResultName getNameAsResultName() {
    java.lang.String str = getName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.privacy.dlp.v2beta1.ResultName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.ListInspectFindingsRequest)
  private static final com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest();
  }

  public static com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInspectFindingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListInspectFindingsRequest>() {
    public ListInspectFindingsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListInspectFindingsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListInspectFindingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInspectFindingsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.ListInspectFindingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

