package No_5_Reverse_Words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



//Scrie o metoda care:
//•	Primeste ca si parametru o lista de cuvinte si returneaza lista de cuvinte inversata, cu mentiunea ca lista inversata nu va include cuvintele care au lungimea mai mica decat 3
//•
//Exemplu:
//Input: {“ana”, “nu”, “are”, “mere”}
//Output: {“mere”, “are”, “ana”}
public class Reverse_Word {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("ana");
        wordsList.add("nu");
        wordsList.add("are");
        wordsList.add("mere");
        System.out.println(reverseWords(wordsList)); //[are, mere, ana]
    }
    //  parcurg fiecare elemt din lista si pentru fiecare cuvant gasit verific daca este mai mic ca 3 il sterg din lista
    //  inversez ordinea cuvinteleor, salvez intru-un string cuvantul sters de pe prima pozitie si al daug apoi in lista
    public static List<String> reverseWords(List<String> wordsList) {
        int len_list = wordsList.size();
        for (int i = 0; i < wordsList.size(); i++) {
                String s = wordsList.get(i);
                if (s.length() < 3) {
                    wordsList.remove(s);
                }
        }
      String s = wordsList.remove(0);
        wordsList.add(s);
        return wordsList;
    }
}
