package Day1.constructor;

public class Apartament extends Mieszkanie {

    public Apartament() {
//        super(); niejawnie wywoluje konstruktor klasy bazowej
    }

    public Apartament(int powierzchnia, int numerPietra) {
        super(powierzchnia);
        this.numerPietra = numerPietra;
    }

    private int numerPietra;

    public int getNumerPietra() {
        return numerPietra;
    }

    public void setNumerPietra(int numerPietra) {
        this.numerPietra = numerPietra;
    }

    // slowo super pozwala na wywolanie nadpisanej metody z klasy bazowej

}
