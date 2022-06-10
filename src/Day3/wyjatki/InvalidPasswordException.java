package Day3.wyjatki;

// Aby utworzyc wlasny wyjatek musze dzidziczyc z klasy jakiegos wyjatku
// nazwa powinna zawierac exception

public class InvalidPasswordException extends RuntimeException {


    public InvalidPasswordException(String message) {
        super(message);
    }
}
