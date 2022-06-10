package Watki.task2;

public class Bridge {

    public synchronized void driveThrough(Car car) {

        System.out.println("Driving through: " + car);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Finished: " + car);
    }
}
