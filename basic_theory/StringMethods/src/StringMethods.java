import java.util.logging.Level;
import java.util.logging.Logger;

public class StringMethods {
    static final String DOT_LINES = "---------------------------";
    static final Logger logger = Logger.getLogger(DOT_LINES);

    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES);
        logger.log(Level.INFO, "---String methods in Java---");
        logger.log(Level.INFO, DOT_LINES);
    }
}
