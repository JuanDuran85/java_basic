package BasicTheory.ArrayMethods.src;

import java.util.logging.Logger;

public class ArrayMethods {
    static final Logger logger = Logger.getLogger(ArrayMethods.class.getName());
    static final String DOT_LINES = "---------------------------";

    public static void main(String[] args){
       logger.info(DOT_LINES);
       logger.info("---Array Creation in Java---");
       logger.info(DOT_LINES);

       logger.info("Different ways to create an array:");
       int[] array = new int[5];
       int[] array2 = {1, 2, 3, 4, 5};
       int[] array3 = new int[] {1, 2, 3, 4, 5};

       logger.info("Array elements created:");
       logger.info("array: " + array);
       logger.info("array2: " + array2);
       logger.info("array3: " + array3);

       logger.info(DOT_LINES);
       logger.info("---Arrays iteration in Java---");
       logger.info(DOT_LINES);

       for (int i = 0; i < array2.length; i++) {
           logger.info("Number: " + array2[i]);
       }

       for (int num : array3) {
           logger.info("Number: " + num);
       }

       logger.info(DOT_LINES);

       logger.info("---Multi-Dimensional Arrays in Java---");
       logger.info(DOT_LINES);

        logger.info("Different ways to create a multi-dimensional array:");
        int[][] multiArray = new int[2][3];
        int[][] multiArray2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] multiArray3 = new int[][] {{1, 2, 3}, {4, 5, 6}};

        logger.info("Multi-dimensional array elements created:");
        logger.info("multiArray: " + multiArray);
        logger.info("multiArray2: " + multiArray2);
        logger.info("multiArray3: " + multiArray3);

        logger.info(DOT_LINES);
        logger.info("--- multi-dimensional Arrays iteration in Java---");
        logger.info(DOT_LINES);

        for (int[] row : multiArray2) {
            for (int num : row) {
                logger.info("Number: " + num);
            }
        }

        logger.info(DOT_LINES);
    }
}
