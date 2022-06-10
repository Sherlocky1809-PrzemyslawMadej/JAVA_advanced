package Day6.refleksja;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        FootballPlayer player = new FootballPlayer("John");
        System.out.println(player);
        System.out.println(player.getName());

        Field[] fields = player.getClass().getDeclaredFields();
        System.out.println(fields);

        List<String> playerFields = new ArrayList<>();
        for (Field field: fields) {
            playerFields.add(field.getName());
        }
        System.out.println(playerFields);

        Field surname = player.getClass().getDeclaredField("surname");
        surname.setAccessible(true);
        Object o = surname.get(player);
        System.out.println(o);

        surname.set(player, "psikus");
        System.out.println(player);

    }
}
