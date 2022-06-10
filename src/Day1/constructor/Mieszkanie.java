package Day1.constructor;

public class Mieszkanie {

    //konstruktor domyslny niejawny jesli nie stworzymy konstruktora.

    // Podczas wywolywania konstruktora danej klasy, wywolywane sa rowniez wszystkie konstruktory klas nadrzednych.
    // Konstruktory nie sa dziedziczone.
    // Konstruktor musi miec taka sama nazwe, jak nazwa klasy.
    // Konstruktor domyslny jest zawsze bezparametrowy.

   public Mieszkanie() {
       System.out.println("Mieszkanie domyslne");
   }

    public Mieszkanie(int powierzchnia) {
        this.powierzchnia = powierzchnia;
        System.out.println("Mieszkanie parametrowe");
    }
    // jesli dodamy inny konstruktor, java nie dostarczy domyslnego

    private int powierzchnia;

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }
}
