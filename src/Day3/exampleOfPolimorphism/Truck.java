package Day3.exampleOfPolimorphism;

// klasa Truck dziedziczaca z klasy Car
public class Truck extends Car {

    private int capacity;

    @Override
    public void drive() {
//        super.drive();
        // odwolanie sie do metody z klasy bazowej
        System.out.println("metoda Truck drive");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
