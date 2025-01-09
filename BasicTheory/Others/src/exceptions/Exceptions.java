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


    /*
     * 1. Built-in Exception
     * There are pre-defined exception classes provided by Java to handle common errors during program
     * execution.
     * 1.1 Checked Exceptions
     * There are called compile-time exceptions because these exceptions are checked at compile-time by
     * the compiler. Examples of Checked Exception:
     * - ClassNotFoundException: Throws when the program tries to load a class at runtime but the class is not found
     * because it's not present in the correct location, or it is missing from the project.
     * - InterruptedException: Thrown when a thread is paused and another thread interrupts it.
     * - IOException: Throws when input/output operation fails
     * - InstantiationException: Thrown when the program tries to create an object of a class but fails because the
     * class is abstract, an interface, or has no default constructor.
     * - SQLException: Throws when there’s an error with the database.
     * - FileNotFoundException: Thrown when the program tries to open a file that doesn’t exist.
     * 1.2 Unchecked Exceptions
     * The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these
     * exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t
     * handle or declare it, the program would not give a compilation error. Examples of Unchecked Exception:
     * - ArithmeticException: It is thrown when there’s an illegal math operation.
     * - ClassCastException: It is thrown when you try to cast an object to a class it does not belong to.
     * - NullPointerException: It is thrown when you try to use a null object (e.g. accessing its methods or fields)
     * - ArrayIndexOutOfBoundsException: It occurs when we try to access an array element with an invalid index.
     * - ArrayStoreException: It happens when you store an object of the wrong type in an array.
     * - IllegalThreadStateException: It is thrown when a thread operation is not allowed in its current state
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
