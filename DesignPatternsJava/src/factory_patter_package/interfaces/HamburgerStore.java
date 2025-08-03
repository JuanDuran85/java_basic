package factory_patter_package.interfaces;

import factory_patter_package.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String typeBurgerIn) {
        Hamburger burger;
        burger = this.createHamburger(typeBurgerIn);
        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String typeBurgerIn);
}
