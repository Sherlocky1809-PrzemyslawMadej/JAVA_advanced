package Day5.kompozycja;

public class Taxi extends Car {

    private int taxiNumber;

    public Taxi(String vin, Engine engine, int taxiNumber) {
        super(vin, engine);
        this.taxiNumber = taxiNumber;
    }
}
