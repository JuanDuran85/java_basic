package BasicTheory.Oop.src.example_ventas;

public class Orders {

    private final int orderId;
    private final Products[] products;
    private int productsCount;
    private static  final int MAX_PRODUCTS = 10;
    private static int orderCount;

    public Orders() {
        this.orderId = ++Orders.orderCount;
        this.products = new Products[Orders.MAX_PRODUCTS];
    }

    public void addProduct(Products product) {
        if(this.productsCount < Orders.MAX_PRODUCTS)
            this.products[this.productsCount++] = product;
        else
            System.out.println("The order is full. Maximum number allowed is " + Orders.MAX_PRODUCTS);
    }

    public double getOrderTotal() {
        double total = 0;
        for (int i = 0; i < this.productsCount; i++) {
            Products product = this.products[i];
            total += product.getProductPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Order Id; " + this.orderId + "\n");
        double totalOrder = this.getOrderTotal();
        result.append("\tOrder Total: $").append(totalOrder).append("\n");
        result.append("\tProducts by Order\n");
        for (var i = 0; i < this.productsCount; i++) {
            result.append("\t\t").append(this.products[i]).append("\n");
        }
        return result.toString();
    }

    public void showOrder() {
        System.out.println("Order Id; " + this.orderId);
        double totalOrder = this.getOrderTotal();
        System.out.printf("\tOrder Total: $%.2f \n", totalOrder);
        System.out.println("\tProducts by Order");
        for (var i = 0; i < this.productsCount; i++)
            System.out.println("\t\t" + this.products[i]);
    }

}
