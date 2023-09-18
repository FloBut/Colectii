package No_4_Positive_No;

import java.util.*;

//•	Primeste ca parametru 2 liste de numere si returneaza un set format
// din numerele pozitive din ambele liste primite ca parametru
public class Positive_No {
    public static void main(String[] args) {
        List<Integer> first_List = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        // Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
        // Output: 1, 3, 4, 2
        first_List.add(1);
        first_List.add(-2);
        first_List.add(3);
        first_List.add(4);
        first_List.add(4);
        first_List.add(-5);
        secondList.add(1);
        secondList.add(-7);
        secondList.add(2);
        System.out.println(positive_No(first_List, secondList)); // [1, 2, 3, 4]
    }

    //metoda primeste ca parametru cele doua lsite si va returna numerele pozitive o singura data
        // parcurg cele doua liste si daca numerele sunt mai mari decat 0 atunci le salvez intr o lista de tip hashset
        //returnez lista de tip set

   public static Set<Integer> positive_No(List<Integer> first_List, List<Integer> second_List) {
       Set<Integer> newList = new HashSet<>();

       for (int first: first_List) {
           if (first > 0) {
               newList.add(first);
           }
       }
       for (int second: second_List) {
           if (second > 0) {
               newList.add(second);
           }
       }
       return newList;
   }

}
