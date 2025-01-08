package BasicTheory.Oop.src.example_ventas;

public class Products {

    private final int productId;
    private String productName;
    private double productPrice;
    private static int productCounter;

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + this.productId +
                ", productName='" + this.productName + '\'' +
                ", productPrice=" + this.productPrice +
                '}';
    }

    public Products(String productName, Double productPrice) {
        this.productId = ++Products.productCounter;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    /**
     * @return int return the productId value
     */
    public int getProductId() {
        return this.productId;
    }

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return double return the productPrice
     */
    public double getProductPrice() {
        return this.productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}
