package Day3.exampleOfPolimorphism;

public class App {

    public static void main(String[] args) {
        // mechanizm dziedziczenia - dostęp do metod klasy Car z poziomu referencji klasy Truck
//        Truck truck = new Truck();
//        truck.drive();
        // polimorfizm - obiekt Truck jest przypisana do referencji typu obiektowego klasy bazowej
        // oznacza wywolanie metody rzeczywiscie przekazanego obiektu
        Car car = new Truck();
        car.drive();
        // nie wywola sie na referencji metod np. getCapacity() mimo iż przypisany do niej jest obiekt z tej klasy.

        // car.getCapacity() nie jest dostepna z poziomu referencji typu Car
        // dostepnosc metod zalezy od typu referencji, przez ktory odwolujemy sie do obiektu
    }
}
