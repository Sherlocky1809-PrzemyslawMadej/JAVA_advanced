package Day5.task3;

public class ChildListApp {

    public static void main(String[] args) {
        ChildRepo repo = new ChildRepo();
        repo.addChild(new Child("Antoni", "42247402134","A234"));
        repo.addChild(new Child("Barbara", "23412341234", "DUPA04"));
        repo.addChild(new Child("Zofia", "17697056754", "WS423"));
        repo.addChild(new Child("Zofia", "17697056754", "UY34534"));


        System.out.println("Wyswietlenie listy dzieciakow: ");
        repo.printListWithChildren();
        System.out.println("Posortowanie listy dzieciakow: ");
        repo.sortListWithChildren();
        repo.printListWithChildren();
        System.out.println("Usuniecie duplikatow z listy dzieciakow: ");
        repo.clearDoubledChildren();
        repo.printListWithChildren();
        System.out.println("Lista dzieciakow z duzej: ");
        repo.setNamesToUpperCase();
        repo.printListWithChildren();
        System.out.println("Lista dzieciakow z malych: ");
        repo.setNamesToLowerCase();
        repo.printListWithChildren();
//        distinct
    }

    public static Child generateChildID() {
        IDProvider idGenerator = IDProvider.getInstance();
        return new Child("Przemek", "82342234", "AD234");
    }
}
