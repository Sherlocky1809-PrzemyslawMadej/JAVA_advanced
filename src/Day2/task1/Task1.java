package Day2.task1;

public class Task1 implements Digits {

    @Override
    public int getDigitsSum(String text) {

        char[] chars = text.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                sum += Character.getNumericValue(chars[i]);
            }
        }
        return sum;
    }

    @Override
    public int getDigitsSum(int number) {
//        String s = String.valueOf(number);
//        int digitsSum = getDigitsSum(s);
        return getDigitsSum(String.valueOf(number));
    }
}
