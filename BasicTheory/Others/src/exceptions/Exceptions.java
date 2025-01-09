package exceptions;

public class Exceptions {

    /*
     * Exception handling
     * When executing Java code, different errors can occur: coding errors made by the programmer,
     * errors due to wrong input, or other unforeseeable things.
     * When an error occurs, Java will normally stop and generate an error message.
     * The technical term for this is: Java will throw an exception (throw an error).
     * To handle an exception, we need to catch it.
     * We use try-catch block to catch an exception.
     * The try statement allows you to define a block of code to be tested for errors while it is being executed.
     * The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
     * The try and catch keywords come in pairs
     */

    public static void main(String[] args) {
        int value1 = 35, value2 = 0;
        try {
            var result = value1 / value2;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }








}
