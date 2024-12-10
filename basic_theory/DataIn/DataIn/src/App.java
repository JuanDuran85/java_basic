import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());
    static final String DOT_LINES = "---------------------------";

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "-------- Scanner Methods --------");
        logger.log(Level.INFO, DOT_LINES);

        Scanner scanner = new Scanner(System.in);

        logger.log(Level.INFO, "Enter your name: ");
        String name = scanner.nextLine();
        // The nextLine() method returns a string containing all of the characters up
        // to the next new line character in the scanner, or up to the end of the
        // scanner if there are no more new line characters.

        logger.log(Level.INFO, "Enter your age: ");
        int age = scanner.nextInt();
        // The nextLine() method returns a string containing all of the characters up to
        // the next new line character in the scanner, or up to the end of the scanner
        // if there are no more new line characters.

        logger.log(Level.INFO, "Enter your height: ");
        double height = scanner.nextDouble();
        // The nextLine() method returns a string containing all of the characters up to
        // the next new line character in the scanner, or up to the end of the scanner
        // if there are no more new line characters.

        scanner.nextLine(); // we need to consume the newline character

        logger.log(Level.INFO, "Enter your last name: ");
        String lastName = scanner.nextLine();

        logger.log(Level.INFO, DOT_LINES);
        scanner.close();

        logger.log(Level.INFO, "Name: {0}", name);
        logger.log(Level.INFO, "Last Name: {0}", lastName);
        logger.log(Level.INFO, "Age: {0}", age);
        logger.log(Level.INFO, "Height: {0}", height);

    }
}
