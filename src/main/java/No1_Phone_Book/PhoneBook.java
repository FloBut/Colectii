package No1_Phone_Book;
//1. Implementeaza un PhoneBook

//Atribute:
//contacts: o lista de String-uri reprezentand numere de telefon
//blackList: o lista de String-uri reprezentand numere de telefon blocate

//Metode:
//filterContacts()
//Metoda statica
//Acceptă ca și parametri:
    //o lista de contacte valide
    //o lista de contacte blocate
//Trebuie să șteargă din lista de contacte valide toate numerele care se regăsesc în lista de contacte blocate
//Returnează lista de contacte valide modificată


//addToBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere blocate și îl șterge din lista de contacte
//removeFromBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere și îl șterge din lista de numere blocate

import java.util.ArrayList;


public class PhoneBook {
    ArrayList<String> validContactsList = new ArrayList<>();//numere de telefon valide
    ArrayList<String> blackContactsList = new ArrayList<>();//numere de telefon blocate



    public static ArrayList<String> filterContacts(ArrayList<String> validContacts, ArrayList<String> blackContactList) {
        //parcurg lista de contacte blocate o compar cu list de contacte valide daca un numar din cele blocate este
        // in lista de contacte valide atunci ma folosesc de o alta lista in care pun contactele care nu sunt blocate
        //si returnez lista 
        ArrayList<String> newValidContactList = new ArrayList<>();
        for (String validContact: validContacts) {
            int flag = 0;
            for (String invalidContact: blackContactList) {
                if (validContact.equals(invalidContact)) {
                   flag = 1;
                }
            }
            if (flag == 0) {
                newValidContactList.add(validContact);
            }
        }
        return newValidContactList ;
    }

}
