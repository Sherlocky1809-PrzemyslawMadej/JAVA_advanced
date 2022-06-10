package Day1.main;

import Day1.butelka.Butelka;

public class Main {
    public static void main(String[] args) {

        Butelka butelka1 = new Butelka(2, 1, "54635" );
        Butelka butelka2 = new Butelka(4,3, "13265");
//
//        int capacity = butelka1.getCapacity();
//        System.out.println(capacity);
//
//        int amountOfWater = butelka1.getAmountOfWater();
//        System.out.println(amountOfWater);
//
//        String barCode = butelka1.getBarCode();
//        System.out.println(barCode);
//
//        System.out.println(butelka2);
//        butelka2.fillBottle(-100);
//        System.out.println(butelka2);

        System.out.println(butelka1);
        System.out.println(butelka2);
        System.out.println();
        butelka1.pourBottleToBottle(butelka2, 1);
        System.out.println(butelka1);
        System.out.println(butelka2);

    }
}
