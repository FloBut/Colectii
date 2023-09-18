package No_2_Pow;

import java.util.*;

public class No_2_Pow {
    public static void main(String[] args) {
        List<Double> noList = new ArrayList<>();
        //2,3,4,5 -> 4,9,16,25
        noList.add(2.0);
        noList.add(3.0);
        noList.add(4.0);
        noList.add(5.0);

        System.out.println(pow(noList)); //[4.0, 9.0, 16.0, 25.0]
    }
    //metoda va returna o lista de numere care au fost ridicate la patrat
        //pacurg lista primita ca parametru si ridic la patrat fiecare numar din lista
        //ma foloesec de o variabila pentru a salva rezultatul operatiei de ridicare la puterea a doua
        //rezultatul salvat in variabila il adaug in lista
        //returnez lista
    public static List<Double> pow(List<Double> numbers) {
        List<Double> newNoList = new ArrayList<>();
        for (Double n: numbers) {
            newNoList.add((Math.pow(n, 2)));

        }
        return newNoList;
    }

}
