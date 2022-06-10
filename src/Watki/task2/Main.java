package Watki.task2;

public class Main {

    public static void main(String[] args) {

        Bridge bridgeAB = new Bridge();

        Car car1 = new Car("VW", "Combi");
        Car car2 = new Car("5EAT", "5uv");

        Thread threadCar1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridgeAB.driveThrough(car1);
            }
        });

        Thread threadCar2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridgeAB.driveThrough(car2);
            }
        });

        threadCar1.start();
        threadCar2.start();

    }
}
