package Listy;

import java.util.List;

public interface NamesRepository {

    void addName(String name);
    void removeName(String name);
    String getNames();

    List<String> getNamesList();
}
