package Day2.kopia;

import java.util.ArrayList;
import java.util.List;

public class KopiaPlytkaListaItem {
// kopia plytka, tworzymy druga liste, ktora zawiera te same obiekty
    // jesli wyczyscimy kopie oryginalna lista nadal bedzie zawierac elementy i ten problem
    // nie wystapi
    // problemem moze byc to ze jesli np. zmienimy obiekt na indeksie 1
    // to obiekt bedzie zmieniony w kopii poniewaz to ten sam obiekt
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("zelazko", "dasdas"));
        items.add(new Item("pralka", "rwtret"));
        System.out.println(items);

        List<Item> itemsCopy = new ArrayList<>(items); // Robimy kopie listy
        Item item = itemsCopy.get(1);
        item.setName("psikus hahahah");

        System.out.println("*******Items copy************");
        System.out.println(itemsCopy);

        System.out.println("*******Items copy po usunieciu itema************");
        itemsCopy.remove(0); // Tym samym jesli usuniemy obiket z kopii, lista obiektow na oryginalnej liscie
        // sie nie zmieni
        System.out.println(itemsCopy);

        System.out.println("********Items**********");
        System.out.println(items);
    }
}
