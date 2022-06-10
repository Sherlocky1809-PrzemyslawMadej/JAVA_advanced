package Enumy.task3;

public class Main {

    public static void main(String[] args) {
        float temperature = TemperatureConvert.convertTemperature('K', 'C', 273.15f);
        System.out.println(temperature);

        float temperature2 = TemperatureConvert.convertTemperature('K', 'F', 273.15f);
        System.out.println(temperature2);

        float temperature3 = TemperatureConvert.convertTemperature('X', 'C', 273.15f);
        System.out.println(temperature3);
    }
}
