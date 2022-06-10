package Day1.inheritance;

public class App {

    public static void main(String[] args) {

        // dzięki dziedziczeniu mamy dostęp do zdefiniowanych metod w klasie macierzystej.
        BasicCar basicCar = new BasicCar();

        basicCar.setVehicleName("Taxi");
        System.out.println(basicCar.getVehicleName());
        basicCar.drive();
        basicCar.stop();

        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        // vehicle.stop() nie mam dostępu bo jest zdefiniowana w klasie BasicCar

        // Do referencji klasy bazowej możemy przepisać obiekt klasy pochodnej.
        Vehicle randomVehicle = new BasicCar();
        // Dostęp do metod jest zgodny z typem referencji.
//        randomVehicle.stop(); - stop() nie będzie dostępny
        randomVehicle.drive(); // a;e metoda drive wykona się z klasy Basic Car (polimorfizm).
        // polimorfizm czyli Java wywoła metodę zgodnie z przekazanym typem obiektu.

    }
}
