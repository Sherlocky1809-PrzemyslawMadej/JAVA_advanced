package Day3.account;

public class WhyNotUseDoubleForMoney {

    public static void main(String[] args) {

        System.out.println(1.03 - 0.42);
//        0.61000000000000001
//        przedstawiana w systemie binarnym
//        na co dzien uzywamy systemu dziesietnego
//        nie kazda liczbe systemu dziesietnego da sie przedstawic binarnie

        int a = 1;
        int b = 0;
//        int c = a/b;
//        System.out.println(c);

        double x = 1;
        double y = 0; // liczba dazy do zera ale nie jest zerem w double.
        double result = x/y;
        System.out.println(result);
    }
}
