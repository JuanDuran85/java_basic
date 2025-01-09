package exceptions;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            var result = Arithmetic.division(4, 0);
            System.out.println("result: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        } finally {
            System.out.println("This code will always run.");
        }
    }
}
