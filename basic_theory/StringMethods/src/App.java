import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        final String DOT_LINES = "---------------------------";

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---String Creation in Java---");
        logger.log(Level.INFO, DOT_LINES);

        var collection1 = "Collection 1";
        var collection2 = new String("Collection 2");
        logger.log(Level.INFO, "collection1: {0}", collection1);
        logger.log(Level.INFO, "collection2: {0}", collection2);

        var collection3 = collection1 + " " + collection2;
        logger.log(Level.INFO, "collection3: {0}", collection3);

        String textBlock = """
                This is a textBlock or multiline
                string. It uses
                triple quotes.
                """;

        logger.log(Level.INFO, "textBlock: {0}", textBlock);
        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---charAt in Java---");
        logger.log(Level.INFO, DOT_LINES);
        /*
         * The charAt() method returns the character at the specified index in the
         * string. The index is zero based.
         */
        String usingCharAt = "Non reprehenderit nulla enim nulla.";
        logger.log(Level.INFO, "usingCharAt.charAt(0): {0}", usingCharAt.charAt(0));
        logger.log(Level.INFO, DOT_LINES);

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---comparator string in Java---");
        logger.log(Level.INFO, DOT_LINES);

        /*
         * If we use "==" operator to compare two strings, it will compare their memory addresses or references.
         * If we use the equals() method, it will compare their characters.
         */

        var compare1 = "Hello";
        var compare2 = "Hello";
        var compare3 = new String("Hello");

        logger.log(Level.INFO, "compare1 == compare2: {0}", compare1 == compare2);
        logger.log(Level.INFO, "compare1.equals(compare2): {0}", compare1.equals(compare2));
        logger.log(Level.INFO, "compare1 == compare3: {0}", compare1 == compare3);


    }
}
