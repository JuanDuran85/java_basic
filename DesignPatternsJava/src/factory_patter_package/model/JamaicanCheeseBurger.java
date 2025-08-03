package factory_patter_package.model;

public class JamaicanCheeseBurger extends Hamburger {
    public JamaicanCheeseBurger() {
        name = "Jamaican Style Cheese Burger";
        sauce = "Spicy Jamaican Sauce";
        buns = "Jamaican Buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican Style Burger...");
    }
}
