package Day3.exampleOfPolimorphism;

public class Car {
    // klasa bazowa, ktora dostarcza metody, ktore beda dostepne dla klas dziedziczacych z niej
    private String vin;
    private String carModel;

    public void drive() {
        System.out.println("metoda Car drive");
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
