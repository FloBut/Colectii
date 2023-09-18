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
import java.util.List;


public class PhoneBook {
    List<String> validContactsList;//numere de telefon valide
    List<String> blackContactsList; //numere de telefon blocate


    public static List<String> filterContacts(List<String> validContacts, List<String> blackContactList) {
        //parcurg lista de contacte blocate o compar cu list de contacte valide daca un numar din cele blocate este
        // in lista de contacte valide atunci ma folosesc de o alta lista in care pun contactele care nu sunt blocate
        //si returnez lista

        //pentru a sterge un element din lista cu "contains" atunci parcurg cealalta lista astfel incat lista
        // din care sterg sa nu fie cea parcursa
       for (String contact: blackContactList) {
           if (validContacts.contains(contact)) {
               validContacts.remove(contact);
           }
       }
       return validContacts;
    }

}
