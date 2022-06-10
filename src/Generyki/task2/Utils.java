package Generyki.task2;

public class Utils {

    public static <T> int countIf(Validator<T> validator, T[] tab) {

        int counter = 0;

        for (T t: tab) {
            if (validator.validate(t)) {
                counter++;
            }
        }
        return counter;
    }
}
