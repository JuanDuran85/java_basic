package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {
    /*
     * List Collections:
     * An interface that extends Collection and represents an ordered collection (also known as a sequence).
     * Lists allow duplicate elements and provide positional access to elements.
     * Common implementations include: ArrayList and LinkedList.
     *
     * ArrayList: this class is a resizable array, which can be found in the java.util package.
     * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be
     * modified (if you want to add or remove elements to/from an array, you have to create a new one).
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
    }
}
