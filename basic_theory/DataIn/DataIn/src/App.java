import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());
    static final String DOT_LINES = "---------------------------";

    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "-------- Scanner Methods --------");
        logger.log(Level.INFO, DOT_LINES);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        logger.log(Level.INFO, "Enter your name: ");
        String name = scanner.nextLine();

        logger.log(Level.INFO, "Enter your age: ");
        int age = scanner.nextInt();

        logger.log(Level.INFO, "Name: {0}", name);
        logger.log(Level.INFO, "Age: {0}", age);

    }
}
