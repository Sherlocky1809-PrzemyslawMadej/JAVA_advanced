package Enumy.task3;

import java.util.Arrays;

public enum TemperatureConvert {

    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (5 / 9) * (tempIn - 32);
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return ((tempIn - 32) * 5 / 9) + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return ((tempIn - 273.15f) * 9 / 5) + 32;
        }
    });

    private char inputUnitOfTemperature;
    private char outputUnitOfTemperature;
    private Converter converter;

    TemperatureConvert(char inputUnitOfTemperature, char outputUnitOfTemperature, Converter converter) {
        this.inputUnitOfTemperature = inputUnitOfTemperature;
        this.outputUnitOfTemperature = outputUnitOfTemperature;
        this.converter = converter;
    }

    public static float convertTemperature
            (char input, char output, float temp) {
        for (TemperatureConvert temperatureConvert : values()) {
            if (temperatureConvert.inputUnitOfTemperature == input
                    && temperatureConvert.outputUnitOfTemperature == output) {
                return temperatureConvert.converter.convert(temp);
            }
        }
        System.out.println("Nie znaleziono wartosci dla podanych jednostek.");
        return Integer.MIN_VALUE;
    }
}
