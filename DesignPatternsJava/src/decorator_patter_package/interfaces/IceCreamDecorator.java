package decorator_patter_package.interfaces;

public class IceCreamDecorator implements IceCreamI {
    private IceCreamI iceCream;

    public IceCreamDecorator(IceCreamI iceCreamIn) {
        this.iceCream = iceCreamIn;
    }

    @Override
    public double cost() {
        return iceCream.cost();
    }

}
