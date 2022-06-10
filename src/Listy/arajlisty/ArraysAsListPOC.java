package Listy.arajlisty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListPOC {

    public static void main(String[] args) {

        String[] tablicaImion = {"Rambo", "Rocky"};

        List<String> listaImion = new ArrayList<>();
        listaImion.add("Rambo");
        listaImion.add("Rocky");

        // UWAGA Arrays.asList nie obsluguje dodawania nowych elementow
        // mozemy stosowac tylko do list w celu ich odczytu
        List<String> arraysAsList = Arrays.asList(tablicaImion);
        System.out.println(arraysAsList);
        System.out.println(arraysAsList.size());
        System.out.println(arraysAsList.get(0));

        for (int i = 0; i < arraysAsList.size(); i++) {
            System.out.println(arraysAsList.get(i));
        }

        // UWAGA: Arrays.asList nie obsluguje dodawania nowych elementow - wtedy otrzymamy wyjatek
        // UnsupportedOperationException
        // arraysAsList.add("Terminator");
        // System.out.println(arraysAsList);

        // takie zastosowanie mozecie znalezc
        List<String> names = Arrays.asList("Rambo", "Batman");
        System.out.println(names);
    }
}
