package Listy;

import java.util.ArrayList;
import java.util.List;

public class ArajLista {

    public static void main(String[] args) {

        NamesRepository repo = new NamesRepoImpl();
        repo.addName("Rambo");
        repo.addName("Rocky");
        System.out.println(repo.getNames());

//        List<String> xx = new ArrayList<>();
//        ArrayList<String> yy = new ArrayList<>();

        // Ponizej proba uzycia naszego kodu niezgodnie z logika, zlamanie zasad dobrego programowania
// zwracajac kopie listy w tym przypadku jestesmy w stanie uniemozliwic zmiane szaej listy
        List<String> namesList = repo.getNamesList();
        namesList.clear();
        namesList.add("Psikus");

        System.out.println(repo.getNames());
        System.out.println(repo);




    }
}
