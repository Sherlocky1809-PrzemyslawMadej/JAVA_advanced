package Day4.task3;

import java.util.List;

public interface NamesRepo {

    void addNames(List<String> names);
    void printNames();
    void removeNames(String name);
    void sortListOfNames();
    void changeLettersToUppercase();

}
