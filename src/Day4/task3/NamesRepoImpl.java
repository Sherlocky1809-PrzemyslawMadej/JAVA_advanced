package Day4.task3;
//Napisz program, który najpierw poprosi o 5 imion na standardowym wejściu.
// Wyświetli je i zapyta, które skasować, po czym usunie wszystkie wystapienia podanego imienia,
// posortuje liste, zamieni wszystkie litery na duze, wyświetli ponownie i zakończy działanie.

import java.util.*;
import java.util.stream.Collectors;

public class NamesRepoImpl implements NamesRepo{

    private List<String> names = new ArrayList<>();

    @Override
    public void addNames(List<String> names) {
        this.names.addAll(names);
    }

    @Override
    public void printNames() {
        System.out.println(names);
    }

    @Override
    public void removeNames(String name) {
//       while (names.remove(name) == true);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String nextName = iterator.next();
            boolean result = nextName.equals(name);
            if (result) {
                iterator.remove();
            }
        }

    }

    @Override
    public void sortListOfNames() {

        Comparator<String> comparatorLambda = (o1, o2) -> Integer.compare(o1.length(), o2.length());
        Collections.sort(names, comparatorLambda);

    }

    @Override
    public void changeLettersToUppercase() {
//        for (String name : names) { nie zadziala przez foreach
//            name = name.toUpperCase();
//        }

//        for (int i = 0; i < names.size(); i++) {
//            names.set(i, names.get(i).toUpperCase());
//        }

        for (int i = 0; i < names.size(); i++) {
            String newName = names.get(i).toUpperCase();
            names.set(i, newName);
        }
    }

    @Override
    public String toString() {
        return "NamesRepoImpl{" +
                "names=" + names +
                '}';
    }
}
