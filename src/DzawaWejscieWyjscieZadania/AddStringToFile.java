package DzawaWejscieWyjscieZadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddStringToFile {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";

        try {
            String fileName = "C:/Users/Przemek/Desktop/Praca-Inżynierska_-zmienione_3.docx";
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("To jest super praca inzynierska ");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = bufferedReader.readLine();
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException ioe) {
            System.err.println("IO Exception: " + ioe.getMessage());
        }
    }
}
