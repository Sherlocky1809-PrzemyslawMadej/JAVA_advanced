package Day3.porownanie;

public class StringCompareTo {

    public static void main(String[] args) {

        String adam = "Adam";
        String adan = "Adan";
        String rambo = "Rambo";
        String adam2 = "Adam";

        System.out.println(adam.compareTo(rambo)); // Adam ma być przed Rambo -17
        System.out.println(rambo.compareTo(adam)); // Rambo ma być za Adamem 17
        System.out.println(adam.compareTo(adan)); // Adam ma być przed Adanem -1
        System.out.println(adam.compareTo(adam2)); // Adam i Adam wynik 0
    }
}
