package Day1.abstrakcja;

public class CarApp {

    public static void main(String[] args) {

        Taxi taxi = new Taxi("taxi vin", "number777");
        Truck truck = new Truck("truck viiiiinnn", 444);

        Car taxiCar = taxi;
        taxiCar.drive();

        Truck truckCar = truck;
        truckCar.drive();
    }
}
