package Day5.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortowaniePOC {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Terminator");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Rocky");
        names.add("Terminator");
        names.add("Terminator");
        names.add("Terminator");
        names.add("Batman");
        names.add("      ");
        names.add("Antoni");
        names.add("Cezary");

        System.out.println(names);
//        Collections.sort(names);

//        @FunctionalInterface
//                public interface Comparator<T> {
//            int compare(T o1, T o2);
//        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // posortowanie odwrotne
            }
        };

//        Comparator<String> comparatorLambda = (o1, o2) -> o2.compareTo(o1);
//        Collections.sort(names, comparatorLambda);

//        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
//        Collections.sort(names, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
//        sortujemy wedlug dlugosci Stringa

//        names = names.stream()
//                        .sorted()
//                                .collect(Collectors.toList());

        names = names.stream()
                .filter(name -> !name.equalsIgnoreCase("rambo"))
                .filter(name -> !name.isBlank())
                .sorted((o1, o2) -> o2.compareTo(o1))
                                .collect(Collectors.toList());


        System.out.println(names);

    }
}
