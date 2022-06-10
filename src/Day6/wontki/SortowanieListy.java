package Day6.wontki;

import java.util.Collections;
import java.util.List;

public class SortowanieListy implements Runnable {

    private List<String> imiona;
    private String imie;

    public SortowanieListy(List<String> imiona, String imie) throws InterruptedException {
        this.imiona = imiona;
        this.imie = imie;
        run();
    }

    @Override
    public void run() {
        imiona.add(imie);
        Collections.sort(imiona);
        System.out.println(imiona);
    }
}
