package DzawaWejscieWyjscieZadania;

import java.io.File;

public class ScreenFilesNDirectories {

    public static void main(String[] args) {

        File file = new File("D:/Desktop/Nosek");
        String[] fileList = file.list();

        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
