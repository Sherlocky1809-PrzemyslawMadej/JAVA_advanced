package Day4.task2;

public class ListOfPeopleApp {

    public static void main(String[] args) {

        ListOfPeople list = new ListOfPeopleImpl();
        Human przemek = new Human("Przemek","Buc");
        Human przemek2 = new Human("Przemek","Baran");
        Human olek= new Human("Aleksander","Acki");
        Human grazyna= new Human("Grazyna","Kalowska");

        list.addPerson(przemek);
        list.addPerson(olek);
        list.addPerson(grazyna);
        list.addPerson(przemek2);

        System.out.println(list);
        list.printPeopleByName("Przemek");

    }
}
