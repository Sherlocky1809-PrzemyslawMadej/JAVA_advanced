package Day6.wontki;

public class WlasnyWatek extends Thread {

//    kod ktory wywola sie w watku
    @Override
    public void run() {
        System.out.println("Pozdro z watku");
        int counter = 0;
        while (true) {
            System.out.println(counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
