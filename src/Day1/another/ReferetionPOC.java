package Day1.another;

public class ReferetionPOC {

    public static void main(String[] args) {
        Person rambo = new Person("Rambo");
        Person topSecret = rambo;
        Person tajnyAgent = topSecret;

        // jeden obiekt w trzech referencjach.

        System.out.println(rambo);

        tajnyAgent.setName("Terminator");

        System.out.println(rambo);
        System.out.println(topSecret);

        setPersonName(topSecret);
        System.out.println(topSecret);
        System.out.println(rambo);
    }

    public static void setPersonName(Person randomPerson) {
        randomPerson.setName("randomName");

    }
}
