package naukaWlasna;

import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {
        addNumbers(List.of(1, 2, 3));
        addNumbers(List.of(new Object(), new Object(), new Object()));
    }

    public static void addNumbers(List<? super Integer> list) {

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
