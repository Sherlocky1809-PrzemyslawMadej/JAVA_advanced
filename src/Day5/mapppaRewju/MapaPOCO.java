package Day5.mapppaRewju;

import java.util.HashMap;
import java.util.Map;

public class MapaPOCO {

    public static void main(String[] args) {

//    mapa klucz - uzytkownik, wartosc - samochod;
        Map<String, String> userCars = new HashMap<>();

        userCars.put("Jan", "Ferrari WU0004");
        userCars.put("Franek", "Fiat UI12312");
        userCars.put("Zygmunt", "Toyota IO668");
        userCars.put("Jan", "Buggati WU0005");

        System.out.println(userCars);
    }
}
