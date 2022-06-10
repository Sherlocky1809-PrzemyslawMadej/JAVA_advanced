package DzawaWejscieWyjscieZadania;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFajl {

    public static void main(String[] args) {

        BufferedReader bufferedReader;
        String stringLine;

        try{
            bufferedReader = new BufferedReader(new
                    FileReader("C:\\Users\\Przemek\\Desktop\\Kurs JAVA\\Prework-Systemy-Operacyjne"));
            while ((stringLine = bufferedReader.readLine()) != null) {
                System.out.println(stringLine);
        }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file");
        }

    }
}
