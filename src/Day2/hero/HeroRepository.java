package Day2.hero;

import java.util.List;

public interface HeroRepository {

    void addHero(Hero hero);
    void remove(Hero hero);
    String getHeroes();
    List<Hero> getHeroesList();

}
