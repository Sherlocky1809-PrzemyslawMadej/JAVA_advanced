package Day5.task3;

import java.util.*;
import java.util.stream.Collectors;

public class ChildRepo implements ChildInterface {

    private List<Child> childList = new ArrayList<>();

    @Override
    public void addChild(Child child) {
        childList.add(child);
    }

    @Override
    public void printListWithChildren() {
        System.out.println(childList);
    }

    @Override
    public void sortListWithChildren() {
        childList = childList.stream()
                .sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void clearDoubledChildren() {

        childList = childList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public void setNamesToUpperCase() {

        for (int i = 0; i < childList.size(); i++) {
            String result = childList.get(i).getName().toUpperCase();
            childList.get(i).setName(result);
        }
    }

    @Override
    public void setNamesToLowerCase() {

        for (int i = 0; i < childList.size(); i++) {
            String result = childList.get(i).getName().toLowerCase();
            childList.get(i).setName(result);
        }
    }

    @Override
    public String toString() {
        return "ChildRepo{" +
                "childList=" + childList +
                '}';
    }
}
