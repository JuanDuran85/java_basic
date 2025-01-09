package varargs;

public class VarArgs {
    /*
     * Varargs help us avoid writing boilerplate code by introducing the new syntax
     * that can handle an arbitrary number of parameters automatically
     * using an array under the hood.
     *
     * We can define them using a standard type declaration, followed by an
     * ellipsis.
     * varargs are arrays so we need to work with them just like we’d work with a
     * normal array.
     * Varargs are straightforward to use. But there’re a few rules we have to keep
     * in mind:
     * - Each method can only have one varargs parameter
     * - The varargs argument must be the last parameter
     *
     * Using varargs can lead to so-called Heap Pollution. This happens when we use
     * varargs with generic types. (Heap Pollution is a situation that arises when a
     * variable of a parameterized type refers to an object that is not of that
     * parameterized type.[1] This situation is normally detected during compilation
     * and indicated with an unchecked warning. Later, during runtime heap pollution
     * will often cause a ClassCastException.)
     * Every time we use varargs, the Java compiler creates an array to hold the
     * given parameters. In this case, the compiler creates an array with generic
     * type components to hold the arguments.
     *
     * When we use varargs with generic types, as theres a potential risk of a fatal
     * runtime exception, the Java compiler warns us about a possible unsafe varargs
     * usage
     * The varargs usage is safe if and only if:
     * - We do not store anything in the implicitly created array. In this example,
     * we did store a List<Integer> in that array
     * - We do not let a reference to the generated array escape the method (more on
     * this later)
     *
     * If we are sure that the method itself does safely use the varargs, we can
     * use @SafeVarargs to suppress the warning.
     */

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5, 6); // varargs
        printValues("Maria", 10, 30, 40);
    }

    private static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    private static void printValues(String names, int... numbers) {
        System.out.println("Name: " + names);
        printNumbers(numbers);
    }
}
