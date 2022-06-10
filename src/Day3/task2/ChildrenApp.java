package Day3.task2;

public class ChildrenApp {
//    Napisz program do przechowywania listy  dzieci, ktore chodza do klasy. Identyfikatorem dziecka bedzie Obiekt Dziecko - String.
//    Pola imie wiek wzrost
//    Program ma posiadac nastepujace funkcjonalnosci:
//            -dodaj dziecko do listy
//-wyswielt liste dzieci
//-posortuj dzieci po imieniu/wieku/wzrocie
//    Lista dzieci nie moze posiadac duplikatow
//    Rozwiaz zadanie uzywajac interfejsów

    public static void main(String[] args) {

        ChildRepo repo = new ChildRepoImpl();

        repo.childAdd(new Child("Michal", 12, 160));
        repo.childAdd(new Child("Anna", 10, 150));
        repo.childAdd(new Child("Zuzanna", 14, 165));
        repo.sortChildByName();
        repo.sortChildByHeight();
        repo.printChildList();

    }
}
