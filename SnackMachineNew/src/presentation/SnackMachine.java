package SnackMachineNew.src.presentation;

import SnackMachineNew.src.domain.Snack;
import SnackMachineNew.src.services.FileSnackServices;
import SnackMachineNew.src.services.IServiceSnacks;
import SnackMachineNew.src.services.ListSnackServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {

    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine() {
        boolean exit = false;
        Scanner consoleIn = new Scanner(System.in);

        // create a listSnackServices object
        // IServiceSnacks snackServices = new ListSnackServices();
        IServiceSnacks snackServices = new FileSnackServices();

        // create a snack list products
        List<Snack> products = new ArrayList<>();
        System.out.println("*** Welcome to the Snack Machine ***");
        snackServices.showSnack();

        while (!exit) {
            try {
                var option = showMenu(consoleIn);
                exit = optionsExecution(option, consoleIn, products, snackServices);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());

            } finally {
                System.out.println();
            }
        }
    }

    private static int showMenu(Scanner consoleIn) {
        System.out.print("""
                1. Buy Snack
                2. Show ticket
                3. Add Snack
                4. Show Inventory
                5. Exit
                Choose an option:\s""");

        return Integer.parseInt(consoleIn.nextLine());
    }

    private static boolean optionsExecution(int option, Scanner consoleIn, List<Snack> products, IServiceSnacks snackServices) {
        var exit = false;

        switch (option) {
            case 1 ->
                buySnack(consoleIn, products, snackServices);
            case 2 ->
                showFinalTicket(products);
            case 3 ->
                addSnackToCart(consoleIn,  snackServices);
            case 4 -> showSnackAvailable(consoleIn, snackServices);
            case 5 -> {
                System.out.println("Thanks for using the Snack Machine");
                exit = true;
            }
            default ->
                System.out.println("Invalid option, please try again");
        }

        return exit;
    }

    private static void showSnackAvailable(Scanner consoleIn, IServiceSnacks snackServices) {
        snackServices.showSnack();
    }

    private static void buySnack(Scanner consoleIn, List<Snack> products,  IServiceSnacks snackServices) {

        System.out.println("Enter the snack id");
        int snackId = Integer.parseInt(consoleIn.nextLine());
        boolean existingSnackId = false;

        for (Snack snack : snackServices.getSnacks()) {
            if (snack.getSnackId() == snackId) {
                products.add(snack);
                System.out.println("Snack added to the cart");
                existingSnackId = true;
                break;
            }
        }

        if (!existingSnackId) {
            System.out.println("Snack not found: " + snackId);
        }
    }

    private static void showFinalTicket(List<Snack> products) {
        String ticket = " *** Snack Machine Ticket *** \n";
        double total = 0.0;

        for (Snack product : products) {
            ticket += "\n\t- " + product.getName() + " - $" + product.getPrice();
            total += product.getPrice();
        }

        ticket += String.format("\n\tTotal -> $%.2f", total);
        System.out.println(ticket);
    }

    private static void addSnackToCart(Scanner consoleIn,  IServiceSnacks snackServices) {
        System.out.print("Enter the snack name: ");
        String name = consoleIn.next();
        System.out.print("Enter the snack price: ");
        double price = Double.parseDouble(consoleIn.next());
        snackServices.addSnack(new Snack(name, price));
        System.out.println("Snack added to the inventory");
        snackServices.showSnack();
    }
}
