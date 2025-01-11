package SnackMachine.src.snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {
    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine(){
        boolean exit =  false;
        Scanner consoleIn = new Scanner(System.in);
        // create a snack list products
        List<Snack> products = new ArrayList<>();
        System.out.println("*** Welcome to the Snack Machine ***");
        Snacks.showSnack();

        while (!exit) {
            try {
                var option = showMenu(consoleIn);
                exit = optionsExecution(option, consoleIn, products);
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
                2. Show Inventory
                3. Add Snack
                4. Exit
                Choose an option: \s""");

        return consoleIn.nextInt();
    }

    private static boolean optionsExecution(int option, Scanner consoleIn, List<Snack> products) {
        var exit = false;
        
        switch (option) {
            case  1 -> buySnack(consoleIn, products);
            
        }
        
        return exit;
        
    }

    private static void buySnack(Scanner consoleIn, List<Snack> products) {
    }

}
