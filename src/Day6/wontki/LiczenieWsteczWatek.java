package Day6.wontki;

public class LiczenieWsteczWatek extends Thread {

//    kod ktory wykona sie w watku
    @Override
    public void run() {
        System.out.println("Pozdro z watku");
        int counter = 1000;
        while (true) {
            System.out.println(counter--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
