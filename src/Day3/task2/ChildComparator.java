package Day3.task2;

import java.util.Comparator;

public class ChildComparator implements Comparator<Child> {

    @Override
    public int compare(Child o1, Child o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
