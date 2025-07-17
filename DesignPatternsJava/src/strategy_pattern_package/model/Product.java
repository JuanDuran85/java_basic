package strategy_pattern_package.model;

public class Product {
    private double price;
    private String upcCpde;

    public Product(double price, String upcCpde) {
        this.price = price;
        this.upcCpde = upcCpde;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUpcCpde() {
        return upcCpde;
    }

    public void setUpcCpde(String upcCpde) {
        this.upcCpde = upcCpde;
    }
}
