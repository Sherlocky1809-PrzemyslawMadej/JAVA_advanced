package naukaWlasna;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        final Statistics statisticsA = new Statistics(2.0, List.of(1, 2, 3));
        final Statistics statisticsB = new Statistics(2.5, List.of(2, 3, 2, 3));

        Stream.of(statisticsA, statisticsB)
        .flatMap(statistics -> statistics.getValues().stream())
                .collect(Collectors.toList());


    }
}
