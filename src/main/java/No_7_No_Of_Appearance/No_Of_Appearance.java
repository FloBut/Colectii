package No_7_No_Of_Appearance;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//7. Scrie o metoda care:
//•	Primeste ca parametru o lista de cuvinte si returneaza de cate ori apare fiecare cuvant in lista
//Exemplu:
//Input: {“ana”, “are”, “mere”, “are”}
//Output: {ana=1, are=2, mere=1}
public class No_Of_Appearance {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        words.add("are");
        System.out.println(words);
        System.out.println(appearanceNo(words)); //
        //[ana, are, mere, are]
        //[1, 2, 1, 1]  - > afiseaza toata lista chiar si elemntele care se repeta

    }
    // parcurg lista si pentru fiecare cuvant din lista verific daca se mai afla in lista si numar cate  cuvinte identice
    // sunt in lista si le salvez intr o lista
    //returnez lista de numere intregi
    public static List<Integer> appearanceNo(List<String> words) {
        List<Integer> no_App = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            int app_no = 1;
            for (int j = i + 1; j < words.size();j++ ) {
                if (s.equals(words.get(j))) {
                    app_no++;
                }
            }
            no_App.add(app_no);
        }
        return no_App;
    }
}
