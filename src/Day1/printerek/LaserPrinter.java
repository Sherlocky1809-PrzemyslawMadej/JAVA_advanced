package Day1.printerek;

public class LaserPrinter extends Printer {

    @Override
    public void print(String text) {
        super.print(text); // Wywoluje metode z klasy ktorej dziedziczy
        System.out.println("Laser printer");
    }

    public void psikus() {
        System.out.println("psikus");
    }
}
