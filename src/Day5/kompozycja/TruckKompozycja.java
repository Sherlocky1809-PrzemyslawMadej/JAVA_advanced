package Day5.kompozycja;

public class TruckKompozycja { // nie korzystamy tu z dziedziczenia, podaje zaleznosci przez konstruktor
//    mozemy laczyc z interfejsem

    private String vin;
    private Engine engine;
    private int capacity;

    public TruckKompozycja(String vin, Engine engine, int capacity) {
        this.vin = vin;
        this.engine = engine;
        this.capacity = capacity;
    }

    public String getVin() {
        return vin;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCapacity() {
        return capacity;
    }
}
