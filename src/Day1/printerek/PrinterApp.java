package Day1.printerek;

public class PrinterApp {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.print("Tekst do wydruku");
        // Ogolna implementacja obiektow

        Printer printer1 = new LaserPrinter();
        // moge przypisac obiekty dziedziczace z klasy Printer
        // bardziej specyficznie
        LaserPrinter laserPrinter = new LaserPrinter();
        // moge przypisac obiekty dziedziczace z klasy LaserPrinter

        // wywola sie ta sama metoda, bez wzgledu na to ktorej referencji uzyjemy
        printer.print("aaa");
        laserPrinter.print("bbb");
        printer1.print("dupa");
    }
}
