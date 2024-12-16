package Example04.src;

import java.util.Scanner;
import java.util.logging.Logger;

public class Example04 {

    static final Logger logger = Logger.getLogger(Example04.class.getName());
    static final String DOT_LINES = "---------------------------";//

    static public void main(String[] args) {
        var nextCycle = false;
        var scannerConsole = new Scanner(System.in);
        double initialBalance = 1000.0;
        logger.info(DOT_LINES);
        logger.info("---Using loop in Java---");
        logger.info(DOT_LINES);

        while (!nextCycle) {
            logger.info("\nMenu:\n1. Account Balance\n2. Fast Cash\n3. Deposit\n4. Exit\nEnter your choice:  ");
            var option = scannerConsole.nextInt();

            switch (option) {
                case 1 -> {
                   System.out.printf("Account Balance: %.2f%n", initialBalance);
                }
                case 2 -> {
                    logger.info("Write a Fast Cash amount to retire: ");
                    var fastCash = scannerConsole.nextDouble();
                    if (fastCash <= 0 || fastCash > initialBalance) {
                        logger.warning("Invalid amount or Not enough balance, try again.");
                        continue;
                    }
                    initialBalance -= fastCash;
                    System.out.printf("Remaining balance: %.2f%n", initialBalance);
                    logger.info("Fast Cash successful, retire your money.");
                }

                case 3 ->
                    {logger.info("Write a Deposit amount:");
                    var deposit = scannerConsole.nextDouble();
                    if (deposit <= 0) {
                        logger.warning("Invalid amount, try again.");
                        continue;
                    }
                    initialBalance += deposit;
                }
                case 4 -> {
                    // Exit
                    logger.info("Exit");
                    nextCycle = true;
                }
                default -> logger.warning("Invalid option, try again.");
            }
        }
    }
}
