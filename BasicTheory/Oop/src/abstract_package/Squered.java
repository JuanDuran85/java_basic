package BasicTheory.Oop.src.abstract_package;

// subclass (inherit from Geometry)

class Squared extends Geometry {

    @Override
    public void draw() {
        System.out.println("Drawing a squared");
    }

}