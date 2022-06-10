package Day4.task1;
//Napisz program kasa sklepowa.
//        Obiekt reprezentujacy produkt w sklepie to Item, ktory posiada pola:
//        cena
//        nazwa
//        barcode
//        funkcje kasy sklepowej
//        backoffice:
//        Dodaj produkt do listy produktow
//        Usun produkt z list produktow
//        Wyswietl cene produktu
//        sale:
//        dodaj produkt do paragonu
//        podlicz paragon(po podliczeniu wyczysc)
//        wyczysc paragon
//        Uzyj interface i mapy

import java.util.Objects;

public class Item {

    private int prize;
    private String nameOfProduct;
    private int barcode;

    public Item(int prize, String nameOfProduct, int barcode) {
        this.prize = prize;
        this.nameOfProduct = nameOfProduct;
        this.barcode = barcode;
    }

    public int getPrize() {
        return prize;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Item{" +
                "prize=" + prize +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", barcode=" + barcode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return prize == item.prize && barcode == item.barcode && Objects.equals(nameOfProduct, item.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prize, nameOfProduct, barcode);
    }
}
