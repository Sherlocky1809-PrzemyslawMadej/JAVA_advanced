package naukaWlasna;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBaj {

    public static void main(String[] args) {

        Stream.of("This", "is", "SDA", "the", "best", "academy", "in", "the", "universe")
                .collect(Collectors.groupingBy(String::length))
                        .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
