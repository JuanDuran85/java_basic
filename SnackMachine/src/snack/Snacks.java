package SnackMachine.src.snack;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> snacks;

    // static block to initialize the snacks list
    /*
     * In Java, a static block executes code before the object initialization. A
     * static block is a block of code with a static keyword
     *
     */
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chips", 1.99));
        snacks.add(new Snack("Candy", 0.99));
        snacks.add(new Snack("Soda", 2.49));
        snacks.add(new Snack("Ice Cream", 3.99));
        snacks.add(new Snack("Cookies", 1.49));
        snacks.add(new Snack("Chocolate", 2.99));
        snacks.add(new Snack("Milk", 1.29));
        snacks.add(new Snack("Gum", 0.79));
        snacks.add(new Snack("Pretzels", 1.49));
        snacks.add(new Snack("Popcorn", 1.99));
    }

    public static void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void showSnack() {
        StringBuilder inventorySnacks = new StringBuilder();

        for (var snack : snacks) {
            inventorySnacks.append(snack.toString()).append("\n");
        }

        System.out.println(" ------- Snacks Inventory ------- ");
        System.out.println(inventorySnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }

}
