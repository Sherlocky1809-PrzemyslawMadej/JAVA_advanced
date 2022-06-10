package Day3.wyjatki;

import java.util.InputMismatchException;

public class WyjatekObsluga {

    public static void main(String[] args) {

        try{ // try wymaga albo catch albo finally albo i to i to
//            kod w ktorym moze wystapic blad
        } catch (IllegalArgumentException e) {
            // moze byc kilka klauzul catch
            // ta wykona sie w przypadku bledu IllegalArgumentException
            // w takiej klauzuli catch mozemy przede wszystkim
            // zalogowac blad
            // jesli to mozliwe ponowic akcje
            // wyswietlic uzytkownikowi popup z bledem
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            // multi catch
            // nie moga byc powiazane w hierarchi dziedziczenia
        }
        catch (Exception e ) { // jesli tu pojawi sie Eception obsluzymy wszystkie klasy bledow
            // dziedziczace z Excpetion
            // tu jest strategia obslugi bledu, czyli to co sie wyswietli
            // nie powinno byc pustej klauzuli catch
            // musimy chociaz zalogowac blad
        }
        // lapiemy od szczegolowej klasy bledow do ogolnej
        finally {
            // te blok kodu sie wykona zawsze
            // bez wzgledu na to, czy wyjatek wystapi czy nie
            // np. zamkniecie polaczenia do serwera, zwolnienie zasobow
        }





    }
}
