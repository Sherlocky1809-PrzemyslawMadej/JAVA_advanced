package naukaWlasna;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrzetwarzanieRownolegle {

    public static void main(String[] args) {

        final List<String> result = Arrays.asList("Ala ma kota o imieniu Kotosław".split(" "))
                .parallelStream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
