
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println(" --- Reading file ---");

        String fileName = "my_file.txt";
        File file = new File(fileName);

        try {
            System.out.println("File Content: ");
            // open the file for reading
            BufferedReader fileIn = new BufferedReader(new FileReader(file));
            // first line read from the file
            String line = fileIn.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = fileIn.readLine();
            }
            // close the file
            fileIn.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

    }
}
