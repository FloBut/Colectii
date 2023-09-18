package No2_SpellChecker;
//de refacut conform indicatii video
import java.util.ArrayList;
import java.util.HashSet;

//Cel mai simplu spell checker este bazat pe o lista de cuvinte cunoscute (un dictionar). Daca scrii un text,
// fiecare cuvant trebuie cautat in lista de cuvinte cunoscute, iar daca nu este gasit, inseamna ca e eronat.
// Implementeaza un astfel de spell checker.
//

public class SpellChecker {
    //am o lista de cuvinte care se intinde pe mai multe linii
    ArrayList<String> knownWordsList = new ArrayList<>();
    //iau fiecare litera din cuvantele din lista si le scriu cu litere mici adica
        //parcurg lista de cuvinte si o scriu cu litere mici
    public static ArrayList<String> wordListUpLowerCase(ArrayList<String> knownWordsList) {
        //iau cuvintele din lista de cuvinte si le modific toate cu litere mici
        //declar o lista noua de cuvinte si cuvintele cu literele mici le pun in lista noua pe care o returnez
        ArrayList<String> wordList = new ArrayList<>();
        for (String word: knownWordsList) {
            String eachWord = word.toLowerCase();
            wordList.add(eachWord);
        }
        return wordList;
    }

    //am un numar de linii de texte
    //splituiesc dupa fiecare spatiu cuvintele de pe fiecare linie si sa le adaug intr-o lista de cuvinte
    // cuvintele din lista  le dau ca parametru la metoda de mai sus si apelez metoda care imi va returna o lista de
    //cuvinte cu litere mici
    public static ArrayList<String> secondWordsList(ArrayList<String>  unknownWordsList) {

       return wordListUpLowerCase(unknownWordsList);
    }


    //compar cele doua liste si cuvintele care nu se gasesc in prima lista le salvez intr- o lista de tip hashset
    // si returnz o singura data cuvintele care nu se gasesc in lista,
    // ma folesec de un hashset
    public static HashSet<String> compareWords(ArrayList<String> wordListUpLowerCase, ArrayList<String> findList) {
        HashSet<String> unknownWordsList = new HashSet<>();//declar un hashlist in care voi pune o singura data cuvintele
        for (String s: wordListUpLowerCase ) {
            if ()
                unknownWordsList.add(w);

        }
        return unknownWordsList;
    }
}
