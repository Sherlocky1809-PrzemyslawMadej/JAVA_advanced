package Day5.lambdaAnother;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaPlayerPOC {

    public static void main(String[] args) {

        Player rocky = new Player(2323, 20, "Rocky");
        Player rambo = new Player(999, 44, "Rambo");
        Player terminator = new Player(1500, 18, "Terminator");
        Player batman = new Player(7777, 35, "Batman");

        List<Player> players = Arrays.asList(rocky, rambo, terminator, batman);

        System.out.println(players);
//        batman.setRanking(10); // batman przypisany do zmiennej batman to ten sam batman co batman na liscie
        // czyli pracujemy z tym samym obiektem
        System.out.println(players);

//        Ponizej przypadki sortowania
        List<Player> sortedPlayers = players.stream()
                .filter(player -> player.getRanking() > 2000) // tylko zawodnicy z rankingiem powyzej 2000
//                .sorted((o1,o2) -> Integer.compare(o1.getRanking(), o2.getRanking()))
                .sorted((o1,o2) -> Integer.compare(o1.getAge(), o2.getAge()))
                .collect(Collectors.toList());

        System.out.println(sortedPlayers);

//        @FunctionalInterface
//        public interface Function<T, R> {
//
//            /**
//             * Applies this function to the given argument.
//             *
//             * @param t the function argument
//             * @return the function result
//             */
//            R apply(T t);

        Function<Player, String> function;

        List<String> names = players.stream()
                        .map(player -> player.getName())
                                .collect(Collectors.toList()); // lambda mapujaca obiekt User na obiekt String

        System.out.println(names);

//        Sprawdzamy czy na liscie jest zawodnik o okreslonym kryterium
        boolean isPlayerWithRankingOver2000Present = players.stream()
                .anyMatch(player -> player.getRanking() > 2000);
        System.out.println(isPlayerWithRankingOver2000Present);

        //        Sprawdzamy czy na liscie jest zawodnik o okreslonym kryterium
        boolean ageValidator = players.stream()
                .allMatch(player -> player.getAge() >= 18);
        System.out.println(ageValidator);
    }
}
