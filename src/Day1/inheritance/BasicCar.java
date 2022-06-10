package Day1.inheritance;
// dziedziczenie - używamy słowa extends.
// możemy dziedziczyć tylko po jednej klasie
public class BasicCar extends Vehicle {

    public void stop() {
    System.out.println("Stop");
}
// można nadpisać metodę w klasie dziedziczącej.
    @Override // adnotacja - informacje dla kompilatora, że w tym miejscu nadpisuję jakąś metodę.
    public void drive() {
//        super.drive();
        System.out.println("basic car drive");
        System.out.println("dodaje funkcje BasicDrive");
    }
}

//Czasem mamy grupy obiektów które mają ze sobą wiele wspólnego np. Person, Student, Teacher.
// możemy wyodrębnić wspólne cechy i zachowania czyli stan i funkcje.
// oraz stworzyć klasę bazową wspólną dla tych obiektów.
// W konsekwencji zmiana klasy bazowej zmienia zachowanie klas dziedziczących.
