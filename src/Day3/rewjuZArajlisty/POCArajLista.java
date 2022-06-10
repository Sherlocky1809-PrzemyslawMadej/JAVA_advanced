package Day3.rewjuZArajlisty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class POCArajLista {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rocky");
        names.add("Rambo");
        names.add("Terminator");
        System.out.println(names);

        // petla for i petla foreach
        // iterator jest kolejnym sposobem by odczytac zawartosc listy
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) { // upewniamy sie czy jest jeszcze jakis element
            String name = iterator.next(); // prosimy o ten element
            System.out.println(name);
            if(name.equals("Terminator")) {
                iterator.remove();
            }
        }

//        String name = iterator.next(); // jesli poprosimy o element a juz go nie ma to program wyrzuci blad.
//        System.out.println(name);
        names.remove("Rambo");
        System.out.println(names);
    }
}
