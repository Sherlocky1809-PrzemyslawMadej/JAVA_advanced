package Day5.lambda;

import java.util.function.Predicate;

public class PredicatePOC {

    public static void main(String[] args) {



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

        Predicate<String> isJohn = name -> name.equals("John");
        Predicate<String> isRambo = x -> x.equals("Rambo");
        Predicate<String> isTerminator = psikus -> psikus.equalsIgnoreCase("Terminator");

        System.out.println(isJohn.test("Terminator"));
        System.out.println(isJohn.test("John"));
    }
}
