package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollections {
    /*
     * List Collections:
     * An interface that extends Collection and represents an ordered collection
     * (also known as a sequence).
     * Lists allow duplicate elements and provide positional access to elements.
     * Common implementations include: ArrayList and LinkedList.
     *
     * ArrayList: this class is a resizable array, which can be found in the
     * java.util package.
     * The difference between a built-in array and an ArrayList in Java, is that the
     * size of an array cannot be
     * modified (if you want to add or remove elements to/from an array, you have to
     * create a new one).
     * While elements can be added and removed from an ArrayList whenever you want.
     */

    public static void main(String[] args) {
        System.out.println(" ---- ArrayList ----");
        List myList = new ArrayList();
        myList.add(1);
        myList.add("Hello");
        myList.add(3.14);
        myList.add(true);

        for (Object element : myList) {
            System.out.println(element);
        }

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Apple");
        myStringList.add("Banana");
        myStringList.add("Cherry");
        for (String element : myStringList) {
            System.out.println(element);
        }

        /*
         * A lambda expression is a short block of code which takes in parameters and
         * returns a value.
         * Lambda expressions are similar to methods, but they do not need a name, and
         * they can be implemented
         * right in the body of a method.
         *
         * Represent instances of functional interfaces (interfaces with a single
         * abstract method).
         * They provide a concise way to express instances of single-method interfaces
         * using a block of code.
         *
         * Some Important points about lambda expressions:
         * - The body of a lambda expression can contain zero, one, or more statements.
         * - When there is a single statement curly brackets are not mandatory and the
         * return type of the anonymous function is the same as that of the body
         * expression.
         * - When there is more than one statement, then these must be enclosed in curly
         * brackets (a code block) and the return type of the anonymous function is the
         * same as the type of the value returned within the code block, or void if
         * nothing is returned.
         */

        myStringList.forEach(element -> {
            System.out.println("-------------");
            System.out.println("Element: " + element);
        });

        myStringList.forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");
        names.forEach(System.out::println);
    }
}
