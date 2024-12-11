package Example03.src;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example03 {

    static final Logger logger = Logger.getLogger(Example03.class.getName());
    static final String DOT_LINES_TH = "---------------------------";

    public static void main(String[] args) {

        var console = new Scanner(System.in);
        var exit = false;

        logger.log(Level.INFO, DOT_LINES_TH);
        logger.log(Level.INFO, "---Simple menu loop in Java---");
        logger.log(Level.INFO, DOT_LINES_TH);

        while (!exit) {
            logger.info("""
                        Menu:
                        1. Option 1
                        2. Option 2
                        3. Option 3
                    
                        Please enter your choice:\s
                    """);

            var choice = console.nextInt();

            switch (choice) {
                case 1 -> logger.info("Option 1 selected \n");
                case 2 -> logger.info("Option 2 selected \n");
                case 3 -> {
                    logger.info("Option 3 selected \n");
                    exit = true;
                }
                default -> logger.info("Option not found \n");
            }
        }
    }
}
