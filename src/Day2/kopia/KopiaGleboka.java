package Day2.kopia;

import java.util.ArrayList;
import java.util.List;

public class KopiaGleboka {

    // Chodzi o to, ze po wykonaniu kopii glebokiej obiekty sa od siebie niezalezne
    // Zmiana oryginalu nie powoduje zmiany kopii i odwrotnie

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("zelazko", "dasdas"));
        items.add(new Item("pralka", "dasdre"));
        System.out.println(items);

        List<Item> itemsCopy = new ArrayList<>(); // Tu robimy kopie gleboka

        for (Item item: items) {
            Item copyItem = new Item(item.getName(), item.getBarcode());
            itemsCopy.add(copyItem);
        }

        System.out.println(items);
        System.out.println(itemsCopy);
        System.out.println("************");

        itemsCopy.remove(0);
        itemsCopy.get(0).setName("psikus");

        System.out.println(items);
        System.out.println(itemsCopy);
//        Item item = itemsCopy.get(1);
//        item.setName("psikus hahahah");
//
//        System.out.println("*******Items copy************");
//        System.out.println(itemsCopy);
//
//        System.out.println("*******Items copy po usunieciu itema************");
//        itemsCopy.remove(0);
//        System.out.println(itemsCopy);
//
//        System.out.println("********Items**********");
//        System.out.println(items);
    }
}
