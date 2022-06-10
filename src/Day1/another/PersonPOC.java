package Day1.another;

public class PersonPOC {

    public static void main(String[] args) {
        Person rambo = new Person("Rambo");
        System.out.println("Rambo adres: " + rambo);
        Person rambo2 = new Person("Rambo");
        System.out.println("Rambo 2 adres: " + rambo2);

        System.out.println(rambo.equals(rambo2)); // czy obiekty są takie same

        // Uwaga: ten sam wchodzi w zakres taki sam.
        // Żebyt to działało poprawnie to musimy dostarczyć implementację metody equals.

        boolean b = (rambo == rambo2);
        // Będzie false.
        System.out.println(b);
    }
}
