package Day3.porownanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowaniePOC {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rocky");
        names.add("Rambo");
        names.add("Adam");
        names.add("Terminator");
        names.add("Zenon");

        // names.sort potrzebuje obiektu Comparator
        System.out.println(names);
        Collections.sort(names); //metoda z biblioteki standardowej
        System.out.println(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(333);
        numbers.add(344444);
        numbers.add(8);
        numbers.add(23);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<String> numbersAsString = new ArrayList<>();
        numbersAsString.add("333");
        numbersAsString.add("22");
        numbersAsString.add("22");
        numbersAsString.add("11");
        numbersAsString.add("234");

        System.out.println(numbersAsString);
        Collections.sort(numbersAsString);
        System.out.println(numbersAsString);



    }
}
