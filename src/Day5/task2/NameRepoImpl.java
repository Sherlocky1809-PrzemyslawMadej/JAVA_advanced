package Day5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameRepoImpl implements NameRepo {

    List<String> names = new ArrayList<>();

    @Override
    public void addName(String name) {
        names.add(name);
    }

    @Override
    public void removeName(String name) {
        names.removeIf(x -> x.equals(name));
    }

    @Override
    public void sortListOfNames() {
        names = names.stream()
                .sorted((o1, o2) -> o1.compareTo(o2)) // dodac lambde
                .collect(Collectors.toList());
    }

    @Override
    public void printListOfNames() {
        names.stream()
                        .forEach(name -> System.out.println(name));
    }

    @Override
    public void removeTooShortNames() {
        names = names.stream()
                .filter(x -> x.length() >= 4)
                .collect(Collectors.toList());
    }

    @Override
    public void filtringNamesWithA() {
        names = names.stream()
                .filter(x -> x.contains("a"))
                .collect(Collectors.toList());
    }

    @Override
    public void removeNamesWithX() {
        names = names.stream()
                .filter(x -> !(x.contains("x") || x.contains("X")))
                .collect(Collectors.toList());
    }

    @Override
    public void filtringNamesWithAOrZ() {
        names = names.stream()
                .filter(x -> x.contains("z") || x.contains("Z")
                || x.contains("A") || x.contains("a"))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "NameRepoImpl{" +
                "names=" + names +
                '}';
    }
}
