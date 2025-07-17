package strategy_pattern_package.model;

public class Product {
    private String price;
    private String upcCpde;

    public Product(String price, String upcCpde) {
        this.price = price;
        this.upcCpde = upcCpde;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUpcCpde() {
        return upcCpde;
    }

    public void setUpcCpde(String upcCpde) {
        this.upcCpde = upcCpde;
    }
}
