package factory_patter_package.model;

import factory_patter_package.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String typeBurgerIn) {
        if (typeBurgerIn.equals("cheese")) {
            return new MozambiqueCheeseBurger();
        } else if (typeBurgerIn.equals("Veggie")) {
            return new MozambiqueVeggieBurger();
        } else {
            return null;
        }
    }
}
