package Example02.src;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example02 {
    
    static final Logger logger = Logger.getLogger(Example02.class.getName());
    static final String DOT_LINES_TH = "---------------------------";
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        
        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Generator ID in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);
        

        logger.log(Level.INFO, "Enter your first name:");
        String firstName = scanner.nextLine();

        logger.log(Level.INFO, "Enter your last name:");
        String lastName = scanner.nextLine();

        logger.log(Level.INFO, "Enter your birthday year YYYY:");
        String birthYear = scanner.nextLine();

        int randomNumber = randomGenerator.nextInt(9999) + 1;
        String  numberToString = String.format("%04d", randomNumber);
        String  idValue = firstName.substring(0,2).toUpperCase() + lastName.substring(0,2).toUpperCase() + birthYear.substring(2) + numberToString;
        logger.log(Level.INFO, "Generated ID: {0}", idValue);
    }
}
