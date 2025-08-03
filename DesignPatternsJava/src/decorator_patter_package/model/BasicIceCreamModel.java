package decorator_patter_package.model;

import decorator_patter_package.interfaces.IceCreamI;

public class BasicIceCreamModel implements IceCreamI {

    public BasicIceCreamModel() {
        System.out.println("Creating Basic Ice Cream");
    }

    @Override
    public double cost() {
        System.out.println("Cost of Basic Ice Cream");
        return 0.85;
    }
}
