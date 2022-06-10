package Generyki.task2;

public class MainNo2 {

    public static void main(String[] args) {

        Integer[] tab = {10, 21, 33, 40, 50, 60};
        int counter = Utils.countIf(new Validator<Integer>() {
            @Override
            public boolean validate(Integer value) {
                return value < 45;
            }
        }, tab);
        System.out.println(counter);
    }
}
