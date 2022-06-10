package Day6.wontki;

import java.util.ArrayList;
import java.util.List;

public class SortowanieApp {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        imiona.add("Franek");
        imiona.add("Adam");
        imiona.add("Zenon");
        imiona.add("Zygmunt");

//        new SortowanieListy(imiona, "Terminator");
        imiona.add("Batman");
//        new SortowanieListy(imiona, "Terminator");
        imiona.add("aBatman");
//        new SortowanieListy(imiona, "Antoni");
        System.out.println("Watek glowny " + imiona);
    }
}
