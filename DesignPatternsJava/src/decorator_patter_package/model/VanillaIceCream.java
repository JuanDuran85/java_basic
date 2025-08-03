package decorator_patter_package.model;

import decorator_patter_package.interfaces.IceCreamDecorator;
import decorator_patter_package.interfaces.IceCreamI;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCreamI iceCreamIn) {
        super(iceCreamIn);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream");
        return 0.80 + super.cost();
    }
}
