package Day3.wyjatki;

public class PasswordApp {

    public static void main(String[] args) {

        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.getAccess("***");
        passwordValidator.getAccess("asdasd");
    }
}
