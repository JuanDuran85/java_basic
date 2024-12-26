package BasicTheory.Oop.src.inheritance_package;

public class InheritancePackage {
    /*
    * Inheritance in Java is a mechanism in which one class acquires the properties and behaviors of another class.
    * In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance
    * concept" into two categories:
    * * subclass (child) - the class that inherits from another class
    * * superclass (parent) - the class being inherited from
    * To inherit from a class, use the extends keyword.
    */

    public void inheritanceMethod(){
        System.out.println("This is a public inheritance method.");
    }

    protected void protectedInheritanceMethod(){
        // protected: The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
        System.out.println("This is a protected inheritance method.");
    }

    public static void main(String[] args) {

    }
}

class Inheritance extends InheritancePackage {
    public static void main(String[] args) {
        System.out.println("This is an inheritance package.");
    }
}
