package Day2.kopia;

import java.util.ArrayList;
import java.util.List;

public class ReferencjaPOC {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rambo");
        names.add("Rocky");

        // Tu nie kopiujemy tylko przypisujemy te sama liste do innej referencji
        // raczej tak nie robimy, mamy swiadomosc ze obie referencje przechowuja jedna i ta sama liste
        List<String> namesCopy = names;
        namesCopy.clear();

        System.out.println(names);
        System.out.println(namesCopy);
    }
}
