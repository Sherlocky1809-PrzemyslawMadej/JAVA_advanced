package Day4.task4;

public class StringApp {

    public static void main(String[] args) {

        String s1 = "PIOTR";
        String s2 = "RTOIP";

        StringComparator comparator = new StringComparatorImpl();

        boolean theSameLength = comparator.areStringsHaveTheSameLength(s1, s2);
        System.out.println(theSameLength);
        boolean theSameValue = comparator.areStringsHaveTheSameASCIINumber(s1, s2);
        System.out.println(theSameValue);
        boolean theSameLetters = comparator.areStringsContainTheSameLetters(s1, s2);
        System.out.println(theSameLetters);

        System.out.println("***************");

        boolean changePossible = comparator.changePossible(s1, s2);
        System.out.println(changePossible);

    }
}
