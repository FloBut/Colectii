package org.example;

import java.util.ArrayList;

import static org.example.PhoneBook.filterContacts;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> validContactList = new ArrayList<>();
        validContactList.add("0001");
        validContactList.add("002");
        validContactList.add("003");
        validContactList.add("0005");
        ArrayList<String> invalidContactList = new ArrayList<>();
        invalidContactList.add("0001");
        invalidContactList.add("0005");
        System.out.println(filterContacts(validContactList, invalidContactList));
    }
}