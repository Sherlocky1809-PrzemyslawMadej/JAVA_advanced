package Day5.konfiguracjaObiektow;

public class Car {

    private String vin;
    private Engine engine;

    public Car(String vin) {
        this.vin = vin;
        this.engine = new Engine(200); // przypisanie obiektu klasy Engine do pola engine
    }


}
