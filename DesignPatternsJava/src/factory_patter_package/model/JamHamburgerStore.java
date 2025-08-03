package factory_patter_package.model;

import factory_patter_package.interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String typeBurgerIn) {
        if (typeBurgerIn.equals("cheese")) {
            return new JamaicanCheeseBurger();
        } else if (typeBurgerIn.equals("Veggie")) {
            return new JamaicanVeggieBurger();
        } else {
            return null;
        }
    }
}
