import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Creating {

    public static void main(String[] args) {
        System.out.println(" --- Creating file ---");
        /*
         * Java File Handling
         * The File class from the java.io package, allows us to work with files.
         * To use the File class, create an object of the class, and specify the filename or directory name
         */
        var fileName = "my_file.txt";
        var file = new File(fileName);
        try {
            if (file.exists()) { // exists: Tests whether the file exists
                System.out.println("File already exists.");
            } else {
                // creating file
                /*
                 * public class PrintWriter extends Writer. Prints formatted representations of objects to a text-output stream.
                 * This class implements all of the print methods found in PrintStream.
                 * It does not contain methods for writing raw bytes, for which a program should use unencoded byte streams.
                 */
 /*
                 * public class FileWriter extends OutputStreamWriter. Convenience class for writing character files.
                 * The constructors of this class assume that the default character encoding and the default byte-buffer size are acceptable.
                 * To specify these values yourself, construct an OutputStreamWriter on a FileOutputStream.
                 */
                var outFile = new PrintWriter(new FileWriter(file));
                outFile.close();
                System.out.println("File created.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

    }
}
