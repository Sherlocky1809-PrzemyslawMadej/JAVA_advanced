package Day5.konfiguracjaObiektow;

public class CarApp {

    public static void main(String[] args) {

//        Obiekt generalnie powinien miec jedna odpowiedzialnosc.
//        Odpowiedzialnoscia Car jest dostarczenie funkcji samochodu.
//        Konfiguracja jest kolejna odpowiedzialnoscia
//        Lamie zasade jednej odpowiedzialnosci
//        Powinnismy podawac zaleznosci z zewnatrz


//        Podawanie zaleznosci przez konstruktor
        Engine engine = new Engine(200);
         AnotherCar anotherCar = new AnotherCar("qew", engine);

//         Ponizszy obiekt konfiguruje sobie sam Engine
//        Staramy sie tak nie robic
         Car car = new Car("truj");
    }
}
