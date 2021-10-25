package com.rajni.protobuf;

import com.rajni.protobuf.options.OtherMessage;

public class OptionMessageMain {
    public static void main(String[] args) {
        OtherMessage otherMessage = OtherMessage.newBuilder().setHello("Hello, Rajni !!").build();
        System.out.println(otherMessage);
    }
}
