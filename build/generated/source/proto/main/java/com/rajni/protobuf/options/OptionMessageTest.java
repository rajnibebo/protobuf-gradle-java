// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.rajni.protobuf.options;

/**
 * Protobuf type {@code com.protobuf.example.OptionMessageTest}
 */
public final class OptionMessageTest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.protobuf.example.OptionMessageTest)
    OptionMessageTestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OptionMessageTest.newBuilder() to construct.
  private OptionMessageTest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptionMessageTest() {
    name_ = "";
    sampleList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OptionMessageTest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OptionMessageTest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            isSimple_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sampleList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            sampleList_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              sampleList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              sampleList_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        sampleList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rajni.protobuf.options.OptionExample.internal_static_com_protobuf_example_OptionMessageTest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rajni.protobuf.options.OptionExample.internal_static_com_protobuf_example_OptionMessageTest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rajni.protobuf.options.OptionMessageTest.class, com.rajni.protobuf.options.OptionMessageTest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int IS_SIMPLE_FIELD_NUMBER = 2;
  private boolean isSimple_;
  /**
   * <code>bool is_simple = 2;</code>
   * @return The isSimple.
   */
  @java.lang.Override
  public boolean getIsSimple() {
    return isSimple_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
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
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int SAMPLE_LIST_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList sampleList_;
  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @return A list containing the sampleList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getSampleListList() {
    return sampleList_;
  }
  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @return The count of sampleList.
   */
  public int getSampleListCount() {
    return sampleList_.size();
  }
  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @param index The index of the element to return.
   * @return The sampleList at the given index.
   */
  public int getSampleList(int index) {
    return sampleList_.getInt(index);
  }
  private int sampleListMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (isSimple_ != false) {
      output.writeBool(2, isSimple_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (getSampleListList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(sampleListMemoizedSerializedSize);
    }
    for (int i = 0; i < sampleList_.size(); i++) {
      output.writeInt32NoTag(sampleList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (isSimple_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isSimple_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sampleList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(sampleList_.getInt(i));
      }
      size += dataSize;
      if (!getSampleListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      sampleListMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.rajni.protobuf.options.OptionMessageTest)) {
      return super.equals(obj);
    }
    com.rajni.protobuf.options.OptionMessageTest other = (com.rajni.protobuf.options.OptionMessageTest) obj;

    if (getId()
        != other.getId()) return false;
    if (getIsSimple()
        != other.getIsSimple()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSampleListList()
        .equals(other.getSampleListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + IS_SIMPLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSimple());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSampleListCount() > 0) {
      hash = (37 * hash) + SAMPLE_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSampleListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rajni.protobuf.options.OptionMessageTest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.rajni.protobuf.options.OptionMessageTest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.protobuf.example.OptionMessageTest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.protobuf.example.OptionMessageTest)
      com.rajni.protobuf.options.OptionMessageTestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rajni.protobuf.options.OptionExample.internal_static_com_protobuf_example_OptionMessageTest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rajni.protobuf.options.OptionExample.internal_static_com_protobuf_example_OptionMessageTest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rajni.protobuf.options.OptionMessageTest.class, com.rajni.protobuf.options.OptionMessageTest.Builder.class);
    }

    // Construct using com.rajni.protobuf.options.OptionMessageTest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      isSimple_ = false;

      name_ = "";

      sampleList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rajni.protobuf.options.OptionExample.internal_static_com_protobuf_example_OptionMessageTest_descriptor;
    }

    @java.lang.Override
    public com.rajni.protobuf.options.OptionMessageTest getDefaultInstanceForType() {
      return com.rajni.protobuf.options.OptionMessageTest.getDefaultInstance();
    }

    @java.lang.Override
    public com.rajni.protobuf.options.OptionMessageTest build() {
      com.rajni.protobuf.options.OptionMessageTest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rajni.protobuf.options.OptionMessageTest buildPartial() {
      com.rajni.protobuf.options.OptionMessageTest result = new com.rajni.protobuf.options.OptionMessageTest(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.isSimple_ = isSimple_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        sampleList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sampleList_ = sampleList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.rajni.protobuf.options.OptionMessageTest) {
        return mergeFrom((com.rajni.protobuf.options.OptionMessageTest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rajni.protobuf.options.OptionMessageTest other) {
      if (other == com.rajni.protobuf.options.OptionMessageTest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getIsSimple() != false) {
        setIsSimple(other.getIsSimple());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.sampleList_.isEmpty()) {
        if (sampleList_.isEmpty()) {
          sampleList_ = other.sampleList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSampleListIsMutable();
          sampleList_.addAll(other.sampleList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.rajni.protobuf.options.OptionMessageTest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rajni.protobuf.options.OptionMessageTest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean isSimple_ ;
    /**
     * <code>bool is_simple = 2;</code>
     * @return The isSimple.
     */
    @java.lang.Override
    public boolean getIsSimple() {
      return isSimple_;
    }
    /**
     * <code>bool is_simple = 2;</code>
     * @param value The isSimple to set.
     * @return This builder for chaining.
     */
    public Builder setIsSimple(boolean value) {
      
      isSimple_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_simple = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsSimple() {
      
      isSimple_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
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
     * <code>string name = 3;</code>
     * @return The bytes for name.
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
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
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
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
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

    private com.google.protobuf.Internal.IntList sampleList_ = emptyIntList();
    private void ensureSampleListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sampleList_ = mutableCopy(sampleList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @return A list containing the sampleList.
     */
    public java.util.List<java.lang.Integer>
        getSampleListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(sampleList_) : sampleList_;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @return The count of sampleList.
     */
    public int getSampleListCount() {
      return sampleList_.size();
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @param index The index of the element to return.
     * @return The sampleList at the given index.
     */
    public int getSampleList(int index) {
      return sampleList_.getInt(index);
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @param index The index to set the value at.
     * @param value The sampleList to set.
     * @return This builder for chaining.
     */
    public Builder setSampleList(
        int index, int value) {
      ensureSampleListIsMutable();
      sampleList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @param value The sampleList to add.
     * @return This builder for chaining.
     */
    public Builder addSampleList(int value) {
      ensureSampleListIsMutable();
      sampleList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @param values The sampleList to add.
     * @return This builder for chaining.
     */
    public Builder addAllSampleList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSampleListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sampleList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 sample_list = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleList() {
      sampleList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.protobuf.example.OptionMessageTest)
  }

  // @@protoc_insertion_point(class_scope:com.protobuf.example.OptionMessageTest)
  private static final com.rajni.protobuf.options.OptionMessageTest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rajni.protobuf.options.OptionMessageTest();
  }

  public static com.rajni.protobuf.options.OptionMessageTest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptionMessageTest>
      PARSER = new com.google.protobuf.AbstractParser<OptionMessageTest>() {
    @java.lang.Override
    public OptionMessageTest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OptionMessageTest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptionMessageTest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptionMessageTest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rajni.protobuf.options.OptionMessageTest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

