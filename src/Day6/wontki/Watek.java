package Day6.wontki;

public class Watek {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start programu");
        Thread.sleep(5000); // uspienie watku na 5 sekund
        System.out.println("Hej pozdro");

        WlasnyWatek watek = new WlasnyWatek();
        watek.start();

//        WlasnyWatek watek1 = new WlasnyWatek();
//        watek1.start();

        LiczenieWsteczWatek watek2 = new LiczenieWsteczWatek();
        watek2.start();

        watek.join();
        watek2.join(); // oczekiwanie na zakonczenie watku

        Runnable runnableThread = new WatekInterface();
        runnableThread.run();
    }
}
