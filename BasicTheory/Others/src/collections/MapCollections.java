package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {

    /*
     * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
     * This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface.
     * The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys,
     * collection of values, or set of key-value mappings.
     *
     * A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
     * One object is used as a key (index) to another object (value). It can store different types:
     * String keys and Integer values, or the same type, like: String keys and String values.
     *
     * The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings.
     * The order of a map is defined as the order in which the iterators on the map's collection views return their elements.
     * Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.
     */


    public static void main(String[] args) {
        System.out.println("*** Working with Map Collections ***");
        Map<String, String> person = new HashMap<>();
        person.put("name", "John");
        person.put("lastName", "Doe");
        person.put("age", "30");
        person.put("country", "USA");
        person.put("city", "New York");

        System.out.println("--------------------------------");
        person.forEach((key, value) -> System.out.println(key + " : " + value)); // show all the key-value pairs with lambda expression
        System.out.println("--------------------------------");
        person.entrySet().forEach(System.out::println); // Returns a Set view of the mappings contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
        System.out.println("--------------------------------");
        person.put("city", "Los Angeles"); // update the value of the key "city"
        person.entrySet().forEach(System.out::println); // Returns a Set view of the mappings contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
        System.out.println("--------------------------------");
        person.remove("city"); // remove the key "city"
        person.entrySet().forEach(System.out::println); // Returns a Set view of the mappings contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
        System.out.println("--------------------------------");
    }


}
