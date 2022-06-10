package InterfejsyIAnonimy.task4;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.setName("Patryk", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return  !input.isBlank() && input != null && Character.isUpperCase(input.charAt(0));
            }
        });

        user.setAge(25, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });

        user.setLogin("pszemcio99", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });

        user.setPassword("Dupa!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });

        user.setSurname("Kolodupiec", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isBlank() && input != null && Character.isUpperCase(input.charAt(0));
            }
        });

        System.out.println(user);

    }
}
