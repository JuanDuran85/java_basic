package decorator_patter_package.model;

import decorator_patter_package.interfaces.IceCreamDecorator;
import decorator_patter_package.interfaces.IceCreamI;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCreamI iceCreamIn) {
        super(iceCreamIn);
    }

    @Override
    public double cost() {
        System.out.println("Adding mint Ice-Cream");
        return 1.7 + super.cost();
    }
}
