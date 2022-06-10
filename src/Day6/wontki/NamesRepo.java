package Day6.wontki;

import java.util.ArrayList;
import java.util.List;

public class NamesRepo {

    private List<String> names = new ArrayList<>();

//    synchronized to slowo kluczowe, ktore zaklada blokade na obiekt
//    Oznacza ze tylko jeden obiekt moze byc wykorzystywany tylko w jednym watku
    public synchronized void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        names.remove(name);
    }
}
