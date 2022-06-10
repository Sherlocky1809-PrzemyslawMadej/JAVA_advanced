package Day4.task3;

import java.util.ArrayList;
import java.util.List;

public class NamesApp {

    public static void main(String[] args) {

        NamesRepo repo = new NamesRepoImpl();
        List<String> names = new ArrayList<>();

        names.add("Jacek");
        names.add("Jacek");
        names.add("Jan");
        names.add("Nina");
        names.add("Antoni");

        repo.printNames();

        repo.addNames(names);
        repo.printNames();
        repo.removeNames("Jacek");
        repo.sortListOfNames();
        repo.changeLettersToUppercase();
        repo.printNames();



    }
}
