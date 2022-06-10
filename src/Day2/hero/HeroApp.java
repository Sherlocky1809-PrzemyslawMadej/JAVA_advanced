package Day2.hero;

import java.util.List;

public class HeroApp {

    public static void main(String[] args) {

        Hero rocky = new Hero("Rocky");
        Hero rambo = new Hero("Rambo");

        HeroRepository repository = new HeroRepoImpl(); // referencja repository jest typu Interface HeroRepository
        // Ten interface implementuje klasę HeroRepoImpl
        repository.addHero(rocky);
        repository.addHero(rambo);

        System.out.println(repository);

        Hero ramboCopy = new Hero("Rambo");
        System.out.println("*****");
        repository.remove(ramboCopy); //musi być zaimplementowana metoda equals() żeby to zadziałało - metoda ta porownuje miejsce w pamieci.
        repository.remove(rambo); // jesli nie zaimplementuje metody equals w klasie object metoda ta porownuje miejsce w pamieci.

        System.out.println(repository);
        System.out.println("***********************");

//        System.out.println(rambo.equals(ramboCopy));
//        System.out.println(ramboCopy.equals(rambo)); to samo.

        //Zwrocilem kopie listy i dlatego nie ma mozliwosci niewlasciwego czyszczenia listy
        List<Hero> heroesList = repository.getHeroesList();
        heroesList.clear();

        System.out.println(repository);
    }
}
