package Day1.abstrakcja;

//klasa abstrakcyjna to klasa, ktorej nie mozemy utworzy obiektu
//robimy to wtedy, kiedy chcemy dostarczyc jakas bazowa wersje klasy
//albo jakas czesc wspolna kilku klas
//ale nie chcemy, zeby tworzono obiekty tej klasy
//mozna z niej dziedziczyc
//moze dostarczac implementacje metod
public abstract class Car {

    private String vin;

    public String getVin() {
        return vin;
    }

    public Car(String vin) {
        this.vin = vin;
    }

    //brak implementacji
    //brak ciala metody
    public abstract void drive();
}
