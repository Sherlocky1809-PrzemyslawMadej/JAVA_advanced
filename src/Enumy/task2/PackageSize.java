package Enumy.task2;

//Stwórz klasę enum ze stałymi SMALL , MEDIUM , LARGE . Enum
//        powinien przyjmować w konstruktorze dwa parametry:
//        minimalny rozmiar paczki w
//        maksymalny rozmiar paczki w
//        Dodatkowo enum powinien zawierać metodę statyczną
//        getPackageSize , która przyjmuje na wejściu minimalny i maksymalny rozmiar
//        paczki, a jako rezultat powinna zwracać konkretny obiekt na
//        podstawie przekazanego rozmiaru paczki.


public enum PackageSize {

    SMALL(0,20),
    MEDIUM(21,40),
    LARGE(41,60),
    UNKNOWN (-1, 0);

    private final int minSizeOfBox;
    private final int maxSizeOfBox;

    PackageSize(int minSizeOfBox, int maxSizeOfBox) {
        this.minSizeOfBox = minSizeOfBox;
        this.maxSizeOfBox = maxSizeOfBox;
    }

    public static PackageSize getPackageSize(int min, int max) {
        for (PackageSize size: values()) {
            if(size.minSizeOfBox <= min && size.maxSizeOfBox >= max) {
                return size;
            }
        }
        return UNKNOWN;
    }
}
