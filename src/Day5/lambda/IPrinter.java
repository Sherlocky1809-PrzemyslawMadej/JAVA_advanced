package Day5.lambda;

@FunctionalInterface // adnotacja pilnuje/sprawdza czy interface ma jedna metode abstrakcyjna
// functional interface to interface z jedna metoda abstrakcyjna
// to nie adnotacja sprawia ze interfejs jest funkcyjny tylko pilnuje tego by taki byl

public interface IPrinter {

    void print (String text);

}
