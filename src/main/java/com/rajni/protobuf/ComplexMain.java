package com.rajni.protobuf;

import com.protobuf.example.ComplexMessageOuterClass;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Example");

        ComplexMessageOuterClass.DummyMessage oneDummy = createDummyMessage(12, "first dummy message");

        ComplexMessageOuterClass.ComplexMessage.Builder builder = ComplexMessageOuterClass.ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);
        builder.addMultiDummy(createDummyMessage(13, "second dummy message"));
        builder.addMultiDummy(createDummyMessage(14, "third dummy message"));
        builder.addMultiDummy(createDummyMessage(15, "fourth dummy message"));

        builder.addAllMultiDummy(Arrays.asList(createDummyMessage(16, "fifth dummy message"),
                createDummyMessage(17, "sixth dummy message")));
        ComplexMessageOuterClass.ComplexMessage message = builder.build();
        System.out.println(message);

    }

    public static ComplexMessageOuterClass.DummyMessage createDummyMessage(Integer id, String name) {
        ComplexMessageOuterClass.DummyMessage message = ComplexMessageOuterClass.DummyMessage.newBuilder().setId(id).setName(name).build();
        return message;
    }
}
