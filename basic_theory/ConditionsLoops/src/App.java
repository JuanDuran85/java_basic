
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());
    static final String DOT_LINES_TH = "--------------------------";

    
    public static void main(String[] args) {

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Conditions if-else in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        /*
          * Conditional Statements: if, else, if-else, switch
         */
        logger.log(Level.INFO, "Checking if number is positive or negative.");
        int num = 10;
        if (num > 0) {
            logger.log(Level.INFO, "Number is positive...");
        } else {
            logger.log(Level.INFO, "The Number is negative.");
        }
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Checking if number is even or odd.");
        num = 10;
        if (num % 2 == 0) {
            logger.log(Level.INFO, "Number is even.");
        } else {
            logger.log(Level.INFO, "Number is odd.");
        }
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Conditions else-if in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Checking if number is positive, negative or zero...");
        num = 0;
        if (num > 0) {
            logger.log(Level.INFO, "Number is positive.");
        } else if (num < 0) {
            logger.log(Level.INFO, "Number is negative.");
        } else {
            logger.log(Level.INFO, "Number is zero.");
        }
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Conditions switch in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Checking if number is positive, negative or zero.");
        num = 0;
        switch (num) {
            case 0 -> logger.log(Level.INFO, "Number is zero.");
            case 1 -> logger.log(Level.INFO, "Number is positive.");
            default -> logger.log(Level.INFO, "Number is negative.");
        }
        logger.log(Level.INFO, DOT_LINES_TH);


        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---while loop in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Use while loop in Java to count from 0 to 9.");
        num = 0;
        while (num < 10) {
            logger.log(Level.INFO, "Number is: {0}", num);
            num++;
        }
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---do-while loop in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Use do-while loop in Java to count from 0 to 9.");
        num = 0;
        do {
            logger.log(Level.INFO, "Number is: {0}", num);
            num++;
        } while (num < 10);
        logger.log(Level.INFO, DOT_LINES_TH);


        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---for loop in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        logger.log(Level.INFO, "Use for loop in Java to count from 0 to 5.");
        for (int i = 0; i <= 5; i++) {
            logger.log(Level.INFO, "Number is: {0}", i);
        }
        logger.log(Level.INFO, DOT_LINES_TH);

    }
}
