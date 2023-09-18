package No1_Phone_Book;

import java.util.ArrayList;
import java.util.List;

import static No1_Phone_Book.PhoneBook.filterContacts;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        List<String> validContactList = new ArrayList<>();
        validContactList.add("0001");
        validContactList.add("002");
        validContactList.add("003");
        validContactList.add("0005");
        List<String> invalidContactList = new ArrayList<>();
        invalidContactList.add("0001");
        invalidContactList.add("0005");
        System.out.println(filterContacts(validContactList, invalidContactList));
    }
}