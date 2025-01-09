
public class ForEach {
    /*
     * The for-each loop in Java (also called the enhanced for loop) was introduced in Java 5 to simplify iteration over arrays and collections.
     * It is cleaner and more readable than the traditional for loop and is commonly used when the exact index of an element is not required.
     * Syntax is:
     * 
        for (type variableName : arrayName) {
                // code block to be executed
        }

     * Parameters:
     * - type: The data type of the elements in the array or collection.
     * - var: The variable that holds the current element during each iteration.
     * - array: The array or collection being iterated over.:

     */

     public static void main(String[] args) {
        int[] ages = {45,34,12,4,56,78};

        for (int age : ages){
            System.out.println(" Age: " + age);
        }
     }
}
