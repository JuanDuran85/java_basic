package Example06.src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example06 {

    static final Logger logger = Logger.getLogger(Example06.class.getName());
    static final String DOT_LINES_TH = "---------------------------";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        logger.info(DOT_LINES_TH);
        logger.info("--- Multi-Dimensional Arrays diagonal---");
        logger.info(DOT_LINES_TH);

        logger.info("Enter the number of columns: ");
        int cols = Integer.parseInt(scanner.next());
        logger.info("Enter the number of rows: ");
        int rows = Integer.parseInt(scanner.next());
        if (cols <= 0 || rows != cols) {
            logger.severe("Invalid input! Number of rows and columns must be positive and equal.");
            return;
        }

        int[][] multiArray = new int[rows][cols];
        int diagonalSum = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                logger.log(Level.INFO, "Enter element at row {0} and column {1}: ", new Object[]{i,j});
                multiArray[i][j] = scanner.nextInt();
                if (i == j) {
                    diagonalSum += multiArray[i][j];
                }
            }
        }

        logger.log(Level.INFO, "Multi-dimensional array: {0}", Arrays.deepToString(multiArray));
        logger.log(Level.INFO, "Sum of diagonal elements: {0}", diagonalSum);
    }
}
