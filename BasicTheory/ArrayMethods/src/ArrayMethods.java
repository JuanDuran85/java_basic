
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayMethods {
    static final Logger logger = Logger.getLogger(ArrayMethods.class.getName());
    static final String DOT_LINES = "------------------------------------------------------";

    public static void main(String[] args) {
        logger.info(DOT_LINES);
        logger.info("---Array Creation in Java---");
        logger.info(DOT_LINES);

        logger.info("Different ways to create an array:");
        int[] array = new int[2];
        int[] array2 = { 1, 2, 3 };
        int[] array3 = new int[] { 1, 2, 3, 4 };

        logger.info("Array elements created:");
        logger.log(Level.INFO, "array: {0}", Arrays.toString(array));
        logger.log(Level.INFO, "array2: {0}", Arrays.toString(array2));
        logger.log(Level.INFO, "array3: {0}", Arrays.toString(array3));

        logger.info(DOT_LINES);
        logger.info("---Arrays iteration in Java---");
        logger.info(DOT_LINES);

        for (int i = 0; i < array2.length; i++) {
            logger.log(Level.INFO, "Number value: {0}", array2[i]);
        }

        for (int num : array3) {
            logger.log(Level.INFO, "Number: {0}", num);
        }

        logger.info(DOT_LINES);

        logger.info("---Multi-Dimensional Arrays in Java---");
        logger.info(DOT_LINES);

        logger.info("Different ways to create a multi-dimensional array:");
        int[][] multiArray = new int[2][3];
        int[][] multiArray2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] multiArray3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

        logger.info("Multi-dimensional array elements created:");
        logger.log(Level.INFO, "multiArray: {0}", Arrays.deepToString(multiArray));
        logger.log(Level.INFO, "multiArray2: {0}", Arrays.deepToString(multiArray2));
        logger.log(Level.INFO, "multiArray3: {0}", Arrays.deepToString(multiArray3));

        logger.info(DOT_LINES);
        logger.info("--- multi-dimensional Arrays iteration in Java---");
        logger.info(DOT_LINES);

        for (int[] row : multiArray2) {
            for (int num : row) {
                logger.log(Level.INFO, "Number: {0}", num);
            }
        }

        logger.info(DOT_LINES);

        logger.info(DOT_LINES);
        logger.info("------------------// Arrays Method //------------------");
        logger.info(DOT_LINES);

        // toString method: returns a string representation of the array
        logger.info(DOT_LINES);
        logger.info("Converting array to string with toString method:");
        logger.info(DOT_LINES);

        logger.log(Level.INFO, "array.toString(): {0}", Arrays.toString(array));

        logger.info(DOT_LINES);

        // compare method: returns 0 if the arrays are equal, 1 if the arrays are not equal
        logger.info(DOT_LINES);
        logger.info("Comparing arrays with compare method:");
        logger.info(DOT_LINES);

        int[] compareArray1 = { 1, 2, 3 };
        int[] compareArray2 = { 1, 2, 3 };
        int[] compareArray3 = { 4, 5, 6 };

        logger.log(Level.INFO, "compareArray1 == compareArray2: {0}", Arrays.compare(compareArray1, compareArray2));
        logger.log(Level.INFO, "compareArray1 == compareArray3: {0}", Arrays.compare(compareArray1, compareArray3));

        logger.info(DOT_LINES);

        // equals method: returns true if the arrays are equal, false if the arrays are not equal
        logger.info(DOT_LINES);
        logger.info("Checking if arrays are equal with equals method:");
        logger.info(DOT_LINES);

        logger.log(Level.INFO, "compareArray1.equals(compareArray2): {0}", Arrays.equals(compareArray1, compareArray2));
        logger.log(Level.INFO, "compareArray1.equals(compareArray3): {0}", Arrays.equals(compareArray1, compareArray3));

        logger.info(DOT_LINES);

        // deepEquals method: Compares two multidimensional arrays to check whether they are deeply equal to each other
        logger.info(DOT_LINES);
        logger.info("Checking if arrays are equal with deepEquals method:");
        logger.info(DOT_LINES);
        // Returns true if the two specified arrays are deeply equal to one another. Two array references are considered deeply equal if both are null, or if they refer to arrays that contain the same number of elements and all corresponding pairs of elements in the two arrays are deeply equal.
        int[][] deepCompareArray1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] deepCompareArray2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] deepCompareArray3 = { { -1, -2, -3 }, { 4, 5, 7 } };

        logger.log(Level.INFO, "deepCompareArray1.deepEquals(deepCompareArray2): {0}", Arrays.deepEquals(deepCompareArray1, deepCompareArray2));
        logger.log(Level.INFO, "deepCompareArray1.deepEquals(deepCompareArray3): {0}", Arrays.deepEquals(deepCompareArray1, deepCompareArray3));

        logger.info(DOT_LINES);

        // fill method: fills the specified array with the specified value
        logger.info(DOT_LINES);
        logger.info("Filling an array with a value using fill method:");
        logger.info(DOT_LINES);
        // The value must be of the same data type as the array. Start and end position can be specified. If not, all elements will be filled. Arrays.fill(array, start, end, value). The array value is required and is the array to be filled. The start element is optional, the defaults value is 0 and is the index position of the first element (inclusive) to be filled. The end element is optional, the defaults to the length of the array and The index position of the last element (exclusive) to be filled. The last element "value" is required and is the value to fill in the array. 
        int[] fillArray = new int[] { 1, 2, 3 };
        logger.log(Level.INFO, "Original fillArray: {0}", Arrays.toString(fillArray));
        Arrays.fill(fillArray, 0, 2, 0); // fill the first two elements of the array with 0
        logger.log(Level.INFO, "fillArray: {0}", Arrays.toString(fillArray));

        logger.info(DOT_LINES);

        // sort method: sorts the specified array into ascending numerical order
        logger.info(DOT_LINES);
        logger.info("Sorting an array using sort method:");
        logger.info(DOT_LINES);
        // Arrays.sort(array, start, end): This method sorts arrays of strings alphabetically, and arrays of integers numerically.
        int[] sortArray = new int[] { 3, 2, 1 };
        logger.log(Level.INFO, "Original sortArray: {0}", Arrays.toString(sortArray));
        Arrays.sort(sortArray);
        logger.log(Level.INFO, "sortArray: {0}", Arrays.toString(sortArray));
        int[] sortArray2 = new int[] { 3, 2, 1, 30, 40, 2, 5, 6,20, 17, 25 };
        Arrays.sort(sortArray2, 1, 4);
        logger.log(Level.INFO, "sortArray: {0}", Arrays.toString(sortArray2));

        logger.info(DOT_LINES);

        // binarySearch method: returns the index of the specified element in the specified array
        logger.info(DOT_LINES);
        logger.info("Searching an array using binarySearch method:");
        logger.info(DOT_LINES);
        // This method searches the specified array of the given data type for the specified value using the binary search algorithm. The array must be sorted by the Arrays.sort() method before making this call. If it is not sorted, the results are undefined. The index of the element is returned, or -1 if the specified value is not found.
        int[] binarySearchArray = new int[] { 3, 2, 1, 30, 40, 2, 5, 6,20, 17, 25 };
        Arrays.sort(binarySearchArray);
        logger.log(Level.INFO, "binarySearchArray: {0}", Arrays.toString(binarySearchArray));
        logger.log(Level.INFO, "binarySearchArray.indexOf(30): {0}", Arrays.binarySearch(binarySearchArray, 30));
        logger.log(Level.INFO, "binarySearchArray.indexOf(2): {0}", Arrays.binarySearch(binarySearchArray, 2));
        logger.log(Level.INFO, "binarySearchArray.indexOf(7): {0}", Arrays.binarySearch(binarySearchArray, 7));

        logger.info(DOT_LINES);
        
    }
}
