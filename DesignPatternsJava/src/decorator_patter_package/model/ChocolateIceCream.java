package decorator_patter_package.model;

import decorator_patter_package.interfaces.IceCreamDecorator;
import decorator_patter_package.interfaces.IceCreamI;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCreamI iceCreamIn) {
        super(iceCreamIn);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate Ice-Cream");
        return 1.3 + super.cost();
    }
}
