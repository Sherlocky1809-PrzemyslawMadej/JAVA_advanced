package Generyki.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class CountIfMain<T> {

    public static void main(String[] args) {

        CountIfMain<Integer> countIfMain = new CountIfMain<>();

        long counter = countIfMain.countIf(Arrays.asList(1,2,3,4,5,6,7), integer -> integer < 4);
        System.out.println(counter);
    }
    public long countIf(Collection<T> collection, Predicate<T> predicate) {

        return collection.stream()
                .filter(predicate)
                .count();
    }
}

