package Day1.abstrakcja;

public class Taxi extends Car {

    private String taxiNumber;

    public Taxi(String vin, String taxiNumber) {
        super(vin);
        this.taxiNumber = taxiNumber;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    @Override
    public void drive() {
        System.out.println("Taxi drive");
    }
}
