package Day5.konfiguracjaObiektow;

public class AnotherCar {

    private String vin;
    private Engine engine;

//    Generalnie powinnismy konfigurowac obiekt z uzyciem konstruktora

    public AnotherCar(String vin, Engine engine) {
        this.vin = vin;
        this.engine = engine;
    }
}
