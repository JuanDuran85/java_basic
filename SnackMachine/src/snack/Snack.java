package SnackMachine.src.snack;

import java.io.Serializable;

public class Snack implements Serializable {
    private static int snackCount = 0;
    private int snackId;
    private String name;
    private double price;

    public Snack(){
        this.snackId = ++Snack.snackCount;

    }

    public Snack (String name, double price) {
        this.name = name;
        rhis,price = price;
    }


    public static void main(String[] args) {

    }
}
