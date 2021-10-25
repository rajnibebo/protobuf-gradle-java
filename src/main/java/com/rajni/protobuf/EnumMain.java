package com.rajni.protobuf;

import com.protobuf.example.EnumExample;

public class EnumMain {
    public static void main(String[] args) {
        EnumExample.EnumMessage message = EnumExample.EnumMessage.newBuilder().setDayOfTheWeek(EnumExample.DayOfWeek.SATURDAY).setId(70).build();
        System.out.println(message.getDayOfTheWeek());
        System.out.println(message);
    }
}
