package com.rajni.protobuf;

import com.protobuf.example.TestOuterClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloo !!");

        TestOuterClass.Test.Builder test = TestOuterClass.Test.newBuilder().setName("Rajni");
        System.out.println(test);

        TestOuterClass.Test message = test.build();
        System.out.println(message.getName());

        try {
            FileOutputStream outputStream = new FileOutputStream("simple.bin");
            message.writeTo(outputStream);

            System.out.println("Message has been written to file");
            outputStream.close();
          //  byte[] bytes = message.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Reading from a file::");
            FileInputStream fin = new FileInputStream("simple.bin");
            TestOuterClass.Test msg = TestOuterClass.Test.parseFrom(fin);
            System.out.println(msg);
        } catch (Exception e) {

        }

    }
}
