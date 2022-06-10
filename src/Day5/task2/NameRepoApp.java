package Day5.task2;

public class NameRepoApp {

    public static void main(String[] args) {

        NameRepo repo = new NameRepoImpl();

        repo.addName("Wieslaw");
        repo.addName("Grazyna");
        repo.addName("Karol");
        repo.addName("Karol");
        repo.addName("Ada");
        repo.addName("Przemek");
        repo.addName("Xiawier");
        repo.addName("Kris");
        repo.addName("Enon");

        System.out.println(repo);

//        repo.removeName("Karol");

        System.out.println(repo);

        repo.sortListOfNames();
        repo.printListOfNames();
        System.out.println("***********");
        repo.removeTooShortNames();
        repo.printListOfNames();

//        repo.filtringNamesWithA();
        System.out.println("Imiona zawierajace litere A: ");
//        repo.printListOfNames();
        System.out.println("************");
        repo.removeNamesWithX();
        repo.printListOfNames();

        System.out.println("************");
//        repo.filtringNamesWithAOrZ();
//        repo.printListOfNames();
    }
}
