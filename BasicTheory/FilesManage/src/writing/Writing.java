
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing {

    @SuppressWarnings({"ConvertToTryWithResources", "CallToPrintStackTrace"})
    public static void main(String[] args) {
        System.out.println(" --- Writing file ---");

        boolean addingNewLines = false;
        String fileName = "my_file.txt";
        File fileCreated = new File(fileName);
        try {
            addingNewLines = fileCreated.exists();
            PrintWriter outFile = new PrintWriter(new FileWriter(fileCreated, addingNewLines));
            var newContent = "new\ncontent\ntwo";
            outFile.println(newContent);
            outFile.close();
            System.out.println("File updated.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
