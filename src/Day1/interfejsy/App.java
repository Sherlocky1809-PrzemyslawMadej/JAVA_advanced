package Day1.interfejsy;

public class App {
    public static void main(String[] args) {

       // po lewej stronie typ referencji, po prawej przypisanie obiektu.
        PhoneInterface phone1 = new IPhone();
        PhoneInterface phone2 = new Samsung();

        //jesli odwoluje sie do obiektu przez referencje typu interface
        // mam dostep tylko do metod zadeklarowanych w interface.

        phone2.dialNumber(5435);
        phone1.dialNumber(1234);
    }
}
