// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.rajni.protobuf.options;

public interface OptionMessageTestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.protobuf.example.OptionMessageTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>bool is_simple = 2;</code>
   * @return The isSimple.
   */
  boolean getIsSimple();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @return A list containing the sampleList.
   */
  java.util.List<java.lang.Integer> getSampleListList();
  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @return The count of sampleList.
   */
  int getSampleListCount();
  /**
   * <code>repeated int32 sample_list = 4;</code>
   * @param index The index of the element to return.
   * @return The sampleList at the given index.
   */
  int getSampleList(int index);
}