package Day4.task2;
//Zadanie
//        Utworz program do przechowywania listy osob o okreslonym imieniu
//        Program ma funkcje dodaj osobe
//        Wyswietl osoby o okreslonym imieniu
//        Uwaga program ma przechowywac liste osob o okreslonym imieniu, nie jedna osobe
//        Pod kluczem imie przechowujemy liste osob(nazwiska) o tym imieniu
//        Osobe dodajemy jako imie i nazwisko
//        Dodajemy osobe dodajac imie i nazwisko
//        Praca domowa
//        Wyswietl imiona wszystkich osob o danym nazwisku

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfPeopleImpl implements ListOfPeople{

    Map<String, List<String>> mapOfHumans = new HashMap<>();


    @Override
    public void addPerson(Human human) {

        List<String> listOfSurnames = mapOfHumans.get(human.getName()); // pobranie konkretnej pozycji mapy
        // na podstawie klucza

        if(listOfSurnames == null) {
            List<String> newListOfSurnames = new ArrayList<>();
            newListOfSurnames.add(human.getSurName());
            mapOfHumans.put(human.getName(), newListOfSurnames);
        }
        else {
        listOfSurnames.add(human.getSurName());
        }
    }

    @Override
    public void printPeopleByName(String name) {
        System.out.println(mapOfHumans.get(name));
    }


    @Override
    public String toString() {
        return "ListOfPeopleImpl{" +
                "mapOfHumans=" + mapOfHumans +
                '}';
    }
}
