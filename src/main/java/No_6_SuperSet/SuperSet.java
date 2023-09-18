package No_6_SuperSet;
//6. Scrie o metoda care:
//•	Primeste ca parametru doua set-uri si returneaza true daca primul set primit ca parametru este superset al celui de-al doilea set
//•	Un set “set1” este superset al altui set “set2”, daca “set1” contine toate elementele din “set2”, dar seturile nu sunt egale - containsAll()
//Exemple:
//Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
//Output1: true
//Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
//Output2: false

import java.util.HashSet;
import java.util.Set;


public class SuperSet {
    public static void main(String[] args) {
        Set<String> firstList = new HashSet<>();
        Set<String> secondList = new HashSet<>();
        firstList.add("ana");
        firstList.add("are");
        firstList.add("mere");
        secondList.add("ana");
        firstList.add("are");
        System.out.println(superSet(firstList, secondList));//true
    }

    //metoda va returna true daca prima lista este mai lunga decat a doua lista si daca are toate cuvintele din a doua lista
    public static boolean superSet(Set<String> firstList, Set<String> secondList) {
        int noWords = 0;
        if (firstList.size() > secondList.size()) {
            for (String secondWord: secondList) {
                if (!(firstList.contains(secondWord))) {
                    return false;
                }
            }
        }
        return true;

    }

}
