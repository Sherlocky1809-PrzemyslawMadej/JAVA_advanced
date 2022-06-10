package Day1.interfejsy;

public interface PhoneInterface {

   // Interface jest kontraktem, ktory mowi jakie metody ma implementowac
    // klasa implementujaca interface
    // nie mozemy utworzyc obiektu z interface

    // Interface definiuje, jakie operacje na nim moze wykonac uzytkownik, ale nie okresla
    // jak te operacje beda przeprowadzane

    void dialNumber(int number);

    void sendSMS(String sms);

    // Metody w interfejsach są publiczne. Są kontraktem ktory mowi jakie metody ma implementowac klasa implementujaca interfejs.
    // nie mozemy utworzyc obiektu z interfejsu.
}
