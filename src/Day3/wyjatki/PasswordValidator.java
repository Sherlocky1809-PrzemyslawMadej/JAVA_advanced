package Day3.wyjatki;

public class PasswordValidator {

        private static final String PASSWORD = "***";

        public void getAccess (String password){
            if (password.equals(PASSWORD)) {
                System.out.println("Password valid");
            } else {
                System.out.println("Wrong password");
                throw new InvalidPasswordException("Wrong password xD");
            }
        }
}
