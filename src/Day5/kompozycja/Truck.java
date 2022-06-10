package Day5.kompozycja;

public class Truck extends Car {

    private int capacity;

    //    Jesli klasa nie ma zadnego konstruktora to java
//    dostarcza konstruktor domyslny, ktory w przypadku
//    dziedziczenia odwoluje sie do konstruktora domyslnego w klasie, z ktorej
//    dziedziczymy
//    jesli w tej klasie nie ma konstruktora bezparametrowego/domyslnego
//    dostaniemy blad kompilacji

// Ponizszy domyslny konstruktor
//    public Truck() {
//        super();
//    }


    public Truck(String vin, Engine engine, int capacity) {
        super(vin, engine);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
