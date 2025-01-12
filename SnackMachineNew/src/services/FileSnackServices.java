package SnackMachineNew.src.services;

import SnackMachineNew.src.domain.Snack;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileSnackServices implements IServiceSnacks {

    private final String FILE_NAME = "snacks.txt";
    private List<Snack> snacksList = new ArrayList<>();

    public FileSnackServices() {
        File fileSnack = new File(FILE_NAME);
        boolean fileExist = false;

        try {
            fileExist = fileSnack.exists();
            if (fileExist) {
                this.snacksList = getSnackFromFile();
            } else {
                PrintWriter fileOut = new PrintWriter(new FileWriter(fileSnack));
                fileOut.close();
                System.out.println("File created successfully");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        if (!fileExist) {
            addNewSnack();
        }
    }

    private List<Snack> getSnackFromFile() {
        ArrayList<Snack> snacks = new ArrayList<>();
        try {
            List<String> linesFile = Files.readAllLines(Paths.get(FILE_NAME));
            for (String line : linesFile) {
                String[] snackInfo = line.split(",");
                String snackName = snackInfo[1];
                String snackPrice = snackInfo[2];
                Snack snackObject = new Snack(snackName, Double.parseDouble(snackPrice));
                snacks.add(snackObject);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        return snacks;
    }

    private void addNewSnack() {
        this.addSnack(new Snack("Chips", 1.99));
        this.addSnack(new Snack("Candy", 0.99));
        this.addSnack(new Snack("Soda", 2.49));
    }

    @Override
    public void addSnack(Snack newSnack) {
        // add to list in memory
        this.snacksList.add(newSnack);
        // save to file
        this.addSnackToFile(newSnack);
    }

    private void addSnackToFile(Snack newSnack) {
        boolean append = false;
        File file = new File(FILE_NAME);

        try {
            append = file.exists();
            PrintWriter fileOut = new PrintWriter(new FileWriter(file, append));
            fileOut.println(newSnack.snackWriter());
            fileOut.close();
            System.out.println("File created successfully");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    @Override
    public void showSnack() {
        System.out.println(" ------- Snacks Inventory ------- ");
        String inventorySnacks = "";

        for(Snack snack : this.snacksList){
            inventorySnacks += snack.toString() + "\n";
        }

        System.out.println(inventorySnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacksList;
    }
}
