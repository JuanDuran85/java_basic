package BasicTheory.Oop.src.example_package;

import BasicTheory.Oop.src.Oop;

public class ExamplePackage {
    public static void main(String[] args) {
        System.out.println("This is an example package.");
        /*  
         * A package in Java is used to group related classes together.
         * A package in Java is used to group related classes
         * Packages are divided into two categories: Built-in Packages (packages from the Java API), User-defined Packages (create your own packages)
        */

        var oopFromPackage = new Oop(5,6);
        oopFromPackage.showDataPublic();
        oopFromPackage.plusInteger(15,5);
    }
}
