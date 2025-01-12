package SnackMachineNew.src.domain;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    private static int snackCount = 0;
    private final int snackId;
    private String name;
    private double price;

    public Snack() {
        this.snackId = ++Snack.snackCount;
    }

    public Snack(String name, double price) {
        this(); // calls the default or empty constructor
        this.name = name;
        this.price = price;
    }

    public static int getSnackCount() {
        return snackCount;
    }

    public int getSnackId() {
        return snackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Snack{"
                + "snackId=" + snackId
                + ", name='" + name + '\''
                + ", price=" + price
                + '}';
    }

    @Override
    public boolean equals(Object o) { // Indicates whether some other object is "equal to" this one.
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Snack snack = (Snack) o;
        return snackId == snack.snackId && Double.compare(this.price, snack.price) == 0 && Objects.equals(this.name, snack.name);
    }

    @Override
    public int hashCode() { // Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those provided by HashMap
        return Objects.hash(this.snackId, this.name, this.price);
    }

    public static void main(String[] args) {

    }
}
