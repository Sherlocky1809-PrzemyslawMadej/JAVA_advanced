package naukaWlasna;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        final int[] idx = {0};

        Stream.generate(() -> idx[0]++ )
        .limit(10)
                .filter(elem -> elem % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(idx));
    }
}
