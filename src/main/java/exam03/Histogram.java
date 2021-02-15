package exam03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Histogram {

    public List<String> readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine())  != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("histogram.txt"))) {
            new FileReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}

}