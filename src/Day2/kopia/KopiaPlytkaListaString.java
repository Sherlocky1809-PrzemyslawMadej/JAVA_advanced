package Day2.kopia;

import java.util.ArrayList;
import java.util.List;

public class KopiaPlytkaListaString {

    public static void main(String[] args) {


        // kopia płytka
        List<String> names = new ArrayList<>();
        names.add("Rambo");
        names.add("Rocky");

        // To jest kopia plytka listy names
        List<String> namesCopy = new ArrayList<>(names);
        namesCopy.clear();

        System.out.println(names);
        System.out.println(namesCopy);
    }
}
