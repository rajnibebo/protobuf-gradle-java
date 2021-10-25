package com.rajni.protobuf;

import com.google.common.collect.Lists;
import com.protobuf.example.exercise.Addressbook;

public class ReadWritePersonMain {
    public static void main(String[] args) {
        Addressbook.AddressBook.Builder addressBook = Addressbook.AddressBook.newBuilder();
        Addressbook.Person.Builder builder = Addressbook.Person.newBuilder();

        Addressbook.AddressBook newAddressBook = writeToAddress(addressBook, builder);
    }

    static Addressbook.AddressBook writeToAddress(Addressbook.AddressBook.Builder addressBook, Addressbook.Person.Builder builder) {
        addressBook
                .addPeople(builder.setId(12).setName("Rajni").setEmail("ubhi.rajni800@gmail.com").build())
                .addPeople(builder.setId(13).setName("Rajni 1").setEmail("ubhi.rajni8001@gmail.com").build())
                .addAllPeople(Lists.newArrayList(
                        builder.setId(14).setName("Rajni 2").setEmail("ubhi.rajni8002@gmail.com").build(),
                        builder.setId(15).setName("Rajni 3").setEmail("ubhi.rajni8003@gmail.com").build()
                ));

        Addressbook.AddressBook newAddressBook = addressBook.build();
        System.out.println("New Address Book has wrote the person details as below:");
        System.out.println(newAddressBook);
        return newAddressBook;
    }
}
