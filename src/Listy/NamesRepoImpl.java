package Listy;

import java.util.ArrayList;
import java.util.List;

public class NamesRepoImpl implements NamesRepository {

    private List<String> names = new ArrayList<>();

    @Override
    public void addName(String name) {
        if(name.equals("Rocky")) {
            System.out.println("Nie dodajemy Rocky");
            return;
        }
        names.add(name);
    }

    @Override
    public void removeName(String name) {
        names.remove(name);
    }

    @Override
    public String getNames() {
        return toString();
    }

    @Override
    public List<String> getNamesList() {
//        return names; nie idzmy ta droga.
        return new ArrayList<>(names);
        // kopia płytka.
    }

    @Override
    public String toString() {
        return "NamesRepoImpl{" +
                "names=" + names +
                '}';
    }
}
