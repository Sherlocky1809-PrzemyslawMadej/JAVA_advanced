package Day5.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierPOC {

    public static void main(String[] args) {

//        Interfejs funkcyjny
        //        Referencja typu interface Supplier<String>
//        Supplier<String> supplier;

//        lewa strona referencja typu interface List<String>
//        prawa strona obiekt implementujacy interface List<String>
        List<String> names = new ArrayList<>();

        Supplier<String> supplierImpl = new SupplierImpl();
        String result = supplierImpl.get();
        System.out.println(result);

//        klasy anonimowe to dosyc przestarzale rozwiazanie, nie stosowane raczej.
        Supplier<String> anonymous = new Supplier<String>() {
            @Override
            public String get() {
                return "anonimowa klasa :)";
            }
        };

        System.out.println(anonymous.get());

//        @FunctionalInterface
//                public interface Supplier<T> {
//            /**
//             * Gets a result.
//             *
//             * @return a result.
//             */
//            T get(); // w naszym przypadku za T podstawiamy String
//        }
//        1. Skopiuj argumenty.
//        2. Postaw znaczek lambda.
//        3. Dodaj implemntacje, ktora zwraca to co metoda.
//        interfejsu funkcyjnego.

//       Lambda daje nam mozliwosc zwiezlego dostarczania implementacji
//        interfejsow funkcyjnych

        Supplier<String> supplier = () -> "pozdro z lambdy"; // NAJWAZNIEJSZA LINIJKA
        System.out.println(supplier.get());
    }

    }

