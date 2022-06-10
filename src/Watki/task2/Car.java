package Watki.task2;

public class Car {

    private final String nameOfCar;
    private final String typeOfCar;

    public Car(String nameOfCar, String typeOfCar) {
        this.nameOfCar = nameOfCar;
        this.typeOfCar = typeOfCar;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + nameOfCar + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
