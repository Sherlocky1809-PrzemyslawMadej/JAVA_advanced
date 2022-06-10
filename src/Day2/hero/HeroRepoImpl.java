package Day2.hero;

import java.util.ArrayList;
import java.util.List;

public class HeroRepoImpl implements HeroRepository {

    private List<Hero> heroes = new ArrayList<>();

    @Override
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    @Override
    public void remove(Hero hero) {
        heroes.remove(hero);
    }

    @Override
    public String getHeroes() {
        return toString();
    }

    @Override
    public List<Hero> getHeroesList() {
        return new ArrayList<>(heroes); // kopia listy heroes
    }

    @Override
    public String toString() {
        return heroes.toString();
    }
}
