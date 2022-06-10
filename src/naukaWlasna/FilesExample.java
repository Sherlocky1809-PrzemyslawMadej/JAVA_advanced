package naukaWlasna;

import java.io.IOException;
import java.nio.file.*;

public class FilesExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");
        Path pathToCopy = Paths.get("data_copy.txt");

        Files.delete(path);
        Files.createFile(path);

        Files.write(path, "test data\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "first line\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "second line\n".getBytes(), StandardOpenOption.APPEND);

        for(String line : Files.readAllLines(path)) {
            System.out.println(line);
        }

        Files.copy(path, pathToCopy);
        Files.delete(pathToCopy);
    }
}
