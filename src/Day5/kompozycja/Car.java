package Day5.kompozycja;

public class Car {

    private String vin;
    private Engine engine;

    public Car(String vin, Engine engine) {
        this.vin = vin;
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
