package Day4.mapy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

       AnimalsRepository repository = new AnimalsRepositoryImpl();
       repository.addAnimal("Jan", "burek");
        System.out.println(repository);
       repository.addAnimal("Zygmunt", "rambo");
       repository.addAnimal("Jan", "pies");
        System.out.println(repository);


    }
}