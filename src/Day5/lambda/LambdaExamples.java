package Day5.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class LambdaExamples {

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
//            boolean test(T t);
//    }

        Predicate<String> isTerminator = x -> x.equalsIgnoreCase("Terminator");

        names.removeIf(isTerminator);

//        przykladowe zastosowanie lambdy
        names.removeIf(name -> name.equalsIgnoreCase("rocky"));
        names.removeIf(x -> x.length() > 4);
        names.removeIf(x -> x.isBlank());

        System.out.println(names);

        //        @FunctionalInterface
//        public interface Consumer<T> { // T zastepujemy Stringiem
//
//            /**
//             * Performs this operation on the given argument.
//             *
//             * @param t the input argument
//             */
//            void accept(T t);

        Optional<String> word = Optional.of("dom");
        word.ifPresent(x -> System.out.println("skonsumowalem " + x)); // PRZYKLADOWE ZASTOSOWANIE LAMBDY!!!

    }
}
