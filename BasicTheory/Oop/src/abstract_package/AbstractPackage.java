package BasicTheory.Oop.src.abstract_package;

public class AbstractPackage {

    /*
     * Data abstraction is the process of hiding certain details and showing only
     * essential information to the user.
     * Abstraction can be achieved with either abstract classes or interfaces (which
     * you will learn more about in the next chapter).
     *
     * The abstract keyword is a non-access modifier, used for classes and methods:
     * - Abstract class: is a restricted class that cannot be used to create objects
     * (to access it, it must be inherited from another class).
     * - Abstract method: can only be used in an abstract class, and it does not
     * have a body. The body is provided by the subclass (inherited from).
     *
     * An abstract class can have both abstract and regular methods.
     */

    public static void main(String[] args) {
        Geometry geometry = new Squared();
        geometry.draw();
    }
}

// abstract class
abstract class Geometry {
    public abstract void draw();
}

// subclass (inherit from Geometry)

public class Squared extends Geometry {

    @Override
    public void draw() {
        System.out.println("Drawing a squared");
    }

}
