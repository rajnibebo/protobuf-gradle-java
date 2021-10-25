package com.rajni.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.protobuf.example.Simple;

public class ProtoToJSONMain {
    public static void main(String[] args) {
        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();

        builder.setId(11).setIsSimple(true);

        try {

            // printing proto class as json
            String format = JsonFormat.printer().includingDefaultValueFields().print(builder);
            System.out.println(format);

            // parsing json into protobuf class
            Simple.SimpleMessage.Builder newBuilder = Simple.SimpleMessage.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(format, newBuilder);

            System.out.println("Generating Protobuf class from JSon is as below:");
            System.out.println(newBuilder.build());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
