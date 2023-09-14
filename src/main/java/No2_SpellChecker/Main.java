package No2_SpellChecker;

import java.util.ArrayList;
import java.util.Scanner;

import static No2_SpellChecker.SpellChecker.*;

////Ce intra in program?
////Pe prima linie utilizatorul introduce numărul de cuvinte din lista de cuvinte cunoscute.
////Apoi, pe câte o linie separată introduce fiecare cuvant din lista de cuvinte cunoscute.
////Apoi, pe o linie, se introduce numărul de linii al textului de verificat.
////Se introduc exact atâtea linii cu text (cuvinte separate prin spațiu).
////Ce iese din program?
////Trebuie să afișam acele cuvinte din text care nu se regăsesc în lista de cuvinte cunoscute.
////Trebuie să verificăm fără să ținem cont de literele mici și mari.
////Cuvintele care nu sunt găsite în dicționar nu ar trebui să fie duplicate, dacă le regăsim de mai multe ori în text.
////Exemplu
////Input:
////3
////a
////bb
////cCc
////2
////a bb aab aba
////ccc c bb aaa
////Output:
////c
////aab
////aaa
////aba
public class Main {
    public static void main(String[] args) {
        ArrayList<String> dexList = new ArrayList<>();
        ArrayList<String> findwordList = new ArrayList<>();
        dexList.add("a");
        dexList.add("bb");
        dexList.add("cCc");
        findwordList.add("a");
        findwordList.add( "bb");
        findwordList.add( "aab");
        findwordList.add("aba");
        findwordList.add("ccc");
        findwordList.add("c");
        findwordList.add( "bb");
        findwordList.add("aaa");
       // System.out.println(secondWordsList(findwordList));
        System.out.println(compareWords(dexList, findwordList));//output-ul nu este in ordine lexicografica: [aaa, aba, ccc, aab, c]
    }
}
