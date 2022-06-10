package Day2.niemutowalne;

// obiekt immutable czyli nie mozna go zmienic
// nie ma settera
// pola sa prywatne
public final class ItemImmutable {

    private final String name; // final oznacza, ze do referencji mozemy przypisac wartosc tylko raz;
    private final String barcode;

    public ItemImmutable(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }


    @Override
    public String toString() {
        return "ItemImmutable{" +
                "name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}
