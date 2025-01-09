package collections;

import java.util.TreeSet;
import java.util.Set;

public class SetCollections {

    /*
     * Set Collections:
     * An interface that extends Collection and represents a collection of unique elements.
     * A collection that contains no duplicate elements. More formally, sets contain no pair
     * of elements e1 and e2 such that e1.equals(e2), and at most one null element.
     * As implied by its name, this interface models the mathematical set abstraction.
     * The Set interface places additional stipulations, beyond those inherited from the Collection interface,
     * on the contracts of all constructors and on the contracts of the add, equals and hashCode methods.
     */
    public static void main(String[] args) {
        // Creating a set
        System.out.println(" Creating a set");
        Set<String> mySet = new TreeSet<>(); // crearing a TreeSet

        // Adding an element
        System.out.println(" Adding an element");
        mySet.add("Apple");
        mySet.add("Cherry");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Apple");
        mySet.add("Apple");
        mySet.add("Cherry");
        mySet.forEach(System.out::println);

        // removing an element
        System.out.println(" Removing an element");
        mySet.remove("Cherry");
        mySet.forEach(System.out::println);
    }
}
