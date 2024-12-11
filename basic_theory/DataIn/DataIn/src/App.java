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

        logger.log(Level.INFO, "Name: {0}", name);
        logger.log(Level.INFO, "Last Name: {0}", lastName);
        logger.log(Level.INFO, "Age: {0}", age);
        logger.log(Level.INFO, "Height: {0}", height);

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "-------- Data Conversion with Scanner Methods --------");
        logger.log(Level.INFO, DOT_LINES);

        // parseInt()
        logger.log(Level.INFO, "Enter a whole number: ");
        String wholeNumberString = scanner.nextLine();
        int wholeNumber = Integer.parseInt(wholeNumberString);
        // parseInt() method converts the string argument to an integer.
        logger.log(Level.INFO, "Whole Number: {0}", wholeNumber);

        // parseDouble()
        logger.log(Level.INFO, "Enter your weight: ");
        String weightString = scanner.nextLine();
        double weight = Double.parseDouble(weightString);
        // parseDouble() method converts the string argument to a double.
        logger.log(Level.INFO, "Weight: {0}", weight);

        // parseFloat()
        logger.log(Level.INFO, "Enter a decimal number: ");
        float decimalNumber = Float.parseFloat(scanner.nextLine());
        // parseFloat() method converts the string argument to a float.
        logger.log(Level.INFO, "Decimal Number: {0}", decimalNumber);

        // parseBoolean()
        logger.log(Level.INFO, "Enter true or false: ");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
        // parseBoolean() method converts the string argument to a boolean.
        logger.log(Level.INFO, "Boolean Value: {0}", booleanValue);

        // parseByte()
        logger.log(Level.INFO, "Enter a byte value: ");
        byte byteValue = Byte.parseByte(scanner.nextLine());
        // parseByte() method converts the string argument to a byte.
        logger.log(Level.INFO, "Byte Value: {0}", byteValue);

        // parseShort()
        logger.log(Level.INFO, "Enter a short value: ");
        short shortValue = Short.parseShort(scanner.nextLine());
        // parseShort() method converts the string argument to a short.
        logger.log(Level.INFO, "Short Value: {0}", shortValue);

        scanner.close(); // close the scanner
    }
}
