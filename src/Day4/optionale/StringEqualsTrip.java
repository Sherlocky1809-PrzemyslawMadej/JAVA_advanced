package Day4.optionale;

public class StringEqualsTrip {

//     u gory definiujemy stale, nazwa z Caps Lockiem
    public static final String SIT_ENV = "sit";
    public static final String UAT_ENV = "uat";
    public static final String PRD_ENV = "prd";

    public static void main(String[] args) {

        String env = null;
        initEnv(env);

    }
//        wyobrazmy sobie metode inicjalizujaca, ktora przejmuje jako argument obiekt typu String
        public static void initEnv(String env) {
        if(SIT_ENV.equals(env)) { // na poczatek dajemy tę zmienną ktora na pewno nie jest nullem a potem equals(n)
//            scenariusz dzialania dla sit
        } else if (UAT_ENV.equals(env)) {
//            scenariusz dzialania dla uat
        } else if (PRD_ENV.equals(env)){
//            PRD
            System.out.println("PRD");
        } else {
//            throw new InvalidEnvException();
            throw new IllegalArgumentException("Invalid env");
        }
        }
    }
