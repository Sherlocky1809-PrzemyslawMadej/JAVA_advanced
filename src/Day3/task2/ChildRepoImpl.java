package Day3.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChildRepoImpl implements ChildRepo {

    List<Child> listOfChildren = new ArrayList<>();

    @Override
    public void childAdd(Child child) {
    listOfChildren.add(child);
    }

    @Override
    public void printChildList() {
        System.out.println(listOfChildren);
    }

    @Override
    public void sortChildByName() {
        Collections.sort(listOfChildren);
    }

    @Override
    public void sortChildByAge() {
        Collections.sort(listOfChildren, new ChildComparator());
    }

    @Override
    public void sortChildByHeight() {
        Collections.sort(listOfChildren, new ChildComparator2());
    }
}
