package trick02;


import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trick02 {

    private static final Logger logger = Logger.getLogger(Trick02.class.getName());

    public static void main(String[] args) {
        System.out.println("Best Practices in Logging");
        Map<String, String> person = new HashMap<>();
        person.put("name", "John");
        person.put("lastName", "Doe");
        person.put("age", "30");
        person.put("country", "USA");
        person.put("city", "New York");
        wellStructuredLog(person);
    }

    public static void wellStructuredLog(Map<String, String> personIn) {
        System.out.println("Well Structured Log");
        /*
         * A well-structured log message should contain relevant information,
         * such as timestamps, log levels, and contextual information.
         * Using a consistent format across your application helps in
         *
         * */
        try {
            // logic here
            logger.log(Level.INFO, "Structured Log: {0} ", personIn.get("name"));
        } catch (Exception ex) {
            logger.throwing("Exception", "Exception message", ex);
        }
    }
}
