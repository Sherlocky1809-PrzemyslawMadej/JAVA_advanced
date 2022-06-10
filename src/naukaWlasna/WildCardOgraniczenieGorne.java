package naukaWlasna;

import java.util.List;

public class WildCardOgraniczenieGorne {

    public static double sum(final List<? extends Number> numbers) { //metoda akceptuje tylko typy rozszerzajace
//        klase Number
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;

    }

    public static void main(String[] args) {

        List<Integer> values = List.of(1, 2, 3);
        System.out.println(sum(values));
    }
}
