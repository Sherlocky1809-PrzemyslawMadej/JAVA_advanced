package Day5.lambda;

public class PrinterApp {

    public static void main(String[] args) {

        IPrinter printer = new PrinterUpperCase();
        printer.print("psikus jakis tekst");


//        klasa anonimowa, kolejny sposob implementacji interfejsow
//        dzisiaj z reguly nie stosuje sie klas anonimowych
//        nie da się z interfejsu utworzyc obiektu
        IPrinter anotherPrinterLowerCase = new IPrinter() {
            @Override
            public void print(String text) {
                System.out.println(text.toLowerCase());
            }
        };

        anotherPrinterLowerCase.print("DUZE LITERY!!!!!");

//        Lewa strona to lista parametrow
//        prawa strona cialo wyrazenia
//        w uproszczeniu lambda to funkcja
//        Lambda jest implementacja interfejsu funkcyjnego
//        Lambdy sie uzywa w polaczeniu ze strumieniami

//        x -> x * x - przykladowe wyrazenie lambda
//        y -> y + y

//        W Javie mamy interfejsy funkcyjne takie jak Function, Consumer, Predicate, Supplier

//        public void print(String text);
        IPrinter lambdaIpl = text -> System.out.println(text.toUpperCase());
        lambdaIpl.print("test wydruku lambda");
    }
}
