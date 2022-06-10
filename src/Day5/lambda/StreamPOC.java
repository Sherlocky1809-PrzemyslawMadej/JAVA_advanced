package Day5.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPOC {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rambo");
        names.add("Rocky");
        names.add("Rocky");
        names.add("Terminator");
        names.add("Terminator");
        names.add("Terminator");
        names.add("Batman");

        System.out.println(names);

        //        @FunctionalInterface
//        public interface Predicate<T> {
//
//            /**
//             * Evaluates this predicate on the given argument.
//             *
//             * @param t the input argument
//             * @return {@code true} if the input argument matches the predicate,
//             * otherwise {@code false}
//             */
//            boolean test(T t);

        Predicate<String> isRocky = name -> name.equalsIgnoreCase("rocky");

        names = names.stream()
//                .filter(isRocky) // deklarujemy jaki jest predyktat filtrowania listy
////                czyli kryterium pozostania na liscie
                .filter(name -> !name.equalsIgnoreCase("rocky")) // usuwanie Rocky
                .filter(name -> !name.isBlank()) //komunikujemy tu intencje
                .filter(name -> name.length() > 2)
                .collect(Collectors.toList()); //ostatnia operacja zbiera rezultaty do listy

        System.out.println(names);
    }
}
