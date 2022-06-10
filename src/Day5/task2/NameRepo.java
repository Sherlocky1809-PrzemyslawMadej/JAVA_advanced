package Day5.task2;

//Utworz repozytorium imion. Imie reprezentuje String.
//        Uzyj interfejsu
//        dodaj funkcje programu
//        -dodaj okreslone imie
//        -usun imie
//        -posortuje liste
//        -wydrukuj zawartosc
//        -usun imiona ktore sa krotsze niz 4 znakow
//        -pozostaw tylko imiona zawierajace litere a
//        -usun imiona zawierajace litere x
//        -pozostaw imiona zawierajace litere a lub z

public interface NameRepo {

    void addName(String name);
    void removeName(String name);
    void sortListOfNames();
    void printListOfNames();
    void removeTooShortNames();
    void filtringNamesWithA();
    void removeNamesWithX();
    void filtringNamesWithAOrZ();

}
