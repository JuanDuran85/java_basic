package SnackMachineNew.src.services;

import SnackMachineNew.src.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileSnackServices implements  IServiceSnacks{

    private final String FILE_NAME = "snacks.txt";
    private List<Snack> snacksList = new ArrayList<>();

    public FileSnackServices(){
        File fileSnack = new File(FILE_NAME);
        boolean fileExist = false;

        try {
            fileExist = fileSnack.exists();
            if(fileExist) {
                //this.snacksList = getSnackFromFile();
            } else {
                PrintWriter fileOut = new PrintWriter(new FileWriter(fileSnack));
                fileOut.close();
                System.out.println("File created successfully");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        if(!fileExist) {
            addNewSnack();
        }
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
            fileOut.println(newSnack);
            fileOut.close();
            System.out.println("File created successfully");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }


    @Override
    public void showSnack() {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
