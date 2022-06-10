package Day4.task4;

public class StringComparatorImpl implements StringComparator {

    @Override
    public boolean areStringsHaveTheSameLength(String s1, String s2) {
        boolean b = s1.length() == s2.length();
        return b;

    }

    @Override
    public boolean areStringsContainTheSameLetters(String s1, String s2) {

        boolean b = true;

            for (int i = 0; i < s1.length(); i++) {
                b = s2.contains(Character.toString(s1.charAt(i)));
            }
        return b;
    }

    @Override
    public boolean areStringsHaveTheSameASCIINumber(String s1, String s2) {

        char[] charsFromString1 = s1.toCharArray();
        char[] charsFromString2 = s2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < charsFromString1.length; i++) {
            sum1 +=  charsFromString1[i];
        }

        for (int i = 0; i < charsFromString2.length; i++) {
            sum2 +=  charsFromString2[i];
        }

        return sum1 == sum2;
    }

    @Override
    public boolean changePossible(String s1, String s2) {

        boolean b1 = areStringsContainTheSameLetters(s1, s2);
        boolean b2 = areStringsHaveTheSameASCIINumber(s1, s2);
        boolean b3 = areStringsHaveTheSameLength(s1, s2);

    return b1 && b2 && b3;
    }
}
