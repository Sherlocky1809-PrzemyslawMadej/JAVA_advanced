package Day4.mapy;

import java.util.HashMap;
import java.util.Map;

public class MapPOC {

    public static void main(String[] args) {
//        mapowanie klucz-wartosc
//        do jednego klucza mamy jedna wartosc (ewentualnie multimapa czyli kilka wartosci w liscie przypisanych
//        do klucza).
//        zaleta implementacji Map to szybkosc
//        Map to interface a HashMap to implementacja (jak List i ArrayList)
//        HashMap to brak informacji o kolejnosci dodania przy wyswietlaniu, brak zachowania kolejnosci dodania

        Map<String, String> map = new HashMap<>();
        map.put("Tygrys", "xxxx"); // dodawanie w mapie
        System.out.println(map.put("Tygrys", "Jan Kowalski"));
        // metoda zwraca poprzednia wartosc przypisana do klucza, jesli brak to zwraca null
        map.put("Dziku", "Zenon Kowalsky");
        map.put("Lampart", "Jacek Buksa");

        System.out.println(map);

        map.remove("Lampart"); // usuwamy element uzywajac klucza
        System.out.println(map);

        map.isEmpty();

        String tygrys = map.get("Tygrys");
        System.out.println(tygrys);

//        wyswietlenie kluczy:
        System.out.println("klucze: ");
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) { // obiekt ktory przechowuje wpis w mapie: klucz i wartosc
//            przypisana Map.Entry<String, String> entry
            System.out.println("klucz " + entry.getKey() + " wartosc " + entry.getValue());
        }
    }
}
