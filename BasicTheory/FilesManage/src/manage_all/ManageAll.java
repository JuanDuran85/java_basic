
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ManageAll {

    public static void main(String[] args) {
        System.out.println(" *** Working with Files with NIO***");

        String fileName = "my_file.txt";

        try {
            List<String> linesFromFile = Files.readAllLines(Paths.get(fileName));
            System.out.println(" Contents of " + fileName + " : ");
            linesFromFile.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
