
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writing {

    public static void main(String[] args) {
        System.out.println(" --- Writing file ---");

        boolean addingNewLines = false;
        String fileName = "my_file.txt";
        File fileCreated = new File(fileName);
        try {
            addingNewLines = fileCreated.exists();
            PrintWriter outFile = new PrintWriter(new FileWriter(fileCreated, addingNewLines));
            var newContent = "new\ncontent";
            outFile.println(newContent);
            outFile.close();
            System.out.println("File updated.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }

    }
}
