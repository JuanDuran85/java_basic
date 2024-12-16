package Example05.src;

import java.util.logging.Logger;

public class Example05 {

    static final String DOT_LINES_TH = "---------------------------";
    static final Logger logger = Logger.getLogger(Example05.class.getName());

    public static void main(String[] args) {
        logger.info("Triangle drawing in Java");

        var scannerConsole = new java.util.Scanner(System.in);
        logger.info(DOT_LINES_TH);
        logger.info("How many lines do you want to draw?: ");
        var lines = scannerConsole.nextInt();
        logger.info(DOT_LINES_TH);

        for (int i = 1; i <= lines; i++) {
            var spaces = " ".repeat(lines - i);
            var stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }
}
