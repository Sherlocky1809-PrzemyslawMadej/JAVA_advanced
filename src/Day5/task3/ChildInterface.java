package Day5.task3;
//Uproszczona werja na teraz
//        Napisz program do przechowywania listy imion dzieci, ktore chodza do klasy. Identyfikatorem dziecka bedzie Obiekt Child pola name i pesel
//        Program ma posiadac nastepujace funkcjonalnosci:
//        -dodaj dziecko do listy
//        -wyswielt liste dzieci
//        -posortuj liste dzieci
//        -wyczysc z duplikatow liste dzieci
//        -zmien wszystkie litery imion na duze
//        -zmien wszystkie litery na male
//        Uzyj interface
//w uproszczeniu druga czesc zadania
//                odpuszczamy menu

import java.util.List;

public interface ChildInterface {

    void addChild(Child child);
    void printListWithChildren();
    void sortListWithChildren();
    void clearDoubledChildren();
    void setNamesToUpperCase();
    void setNamesToLowerCase();
}
