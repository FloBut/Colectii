package No_3_Word_Length;

import java.util.ArrayList;
import java.util.List;

//•	Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru), si il returneaza
public class Word_Length {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        System.out.println(word_Max_Length(words));// mere
    }

    //primesc ca parametru o lista de stringuri si returnez stringul care are lungimea cea mai mare
        //parcurg lista si pentru fiecare cuvant compar lungimea cu lungimea maxima
        //daca cuvantul are lungimea maxima il salvez intr un string pe care il returnez
   public static String word_Max_Length(List<String> words) {
       int max_Length = 0;
       String word = null;
       for (String s: words) {
           if (s.length() > max_Length) {
               max_Length = s.length();
               word = s;
           }
       }
       return word;
   }

}
