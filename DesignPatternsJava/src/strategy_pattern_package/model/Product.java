package strategy_pattern_package.model;

public class Product {
    private Float price;
    private String upcCpde;

    public Product(Float price, String upcCpde) {
        this.price = price;
        this.upcCpde = upcCpde;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUpcCpde() {
        return upcCpde;
    }

    public void setUpcCpde(String upcCpde) {
        this.upcCpde = upcCpde;
    }
}
