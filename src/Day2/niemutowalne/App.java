package Day2.niemutowalne;

public class App {

    public static void main(String[] args) {

        ItemImmutable item = new ItemImmutable("pralka", "ioweqqwe");
        System.out.println(item);

//        item = new OtherItem("pralko lodowka", "jodadasdwe");
        System.out.println(item.getName());


}
}
