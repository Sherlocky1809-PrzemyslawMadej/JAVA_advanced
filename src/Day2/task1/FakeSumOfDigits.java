package Day2.task1;

public class FakeSumOfDigits implements Digits {

    @Override
    public int getDigitsSum(String text) {
        System.out.println(text);
        return 0;
    }

    @Override
    public int getDigitsSum(int number) {
        System.out.println(number);
        return 0;
    }
}
