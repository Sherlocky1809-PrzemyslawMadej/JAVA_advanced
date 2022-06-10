package Day5.lambda;

import java.util.function.Consumer;

public class ConsumerPOC {

    public static void main(String[] args) {

        Consumer<String> consumer;

//        @FunctionalInterface
//        public interface Consumer<T> { // T zastepujemy Stringiem
//
//            /**
//             * Performs this operation on the given argument.
//             *
//             * @param t the input argument
//             */
//            void accept(T t);

        //        1. Skopiuj argumenty.
//        2. Postaw znaczek lambda.
//        3. Dodaj implemntacje, ktora zwraca to co metoda.
//        interfejsu funkcyjnego.

        consumer = x -> System.out.println("Skonsumowalem " + x); // implementacja interfejsu funkcyjnego
//        z uzyciem lambdy

        consumer = (String x) -> System.out.println("Skonsumowalem " + x); // jawnie podalem typ argumentu
//        ale nie musze tego robic, gdyz kompliator zna typ argumentu z Consumer<String> consumer;
//        lambda to "kod jako argument"

        consumer.accept("heheszki");



        }
}
