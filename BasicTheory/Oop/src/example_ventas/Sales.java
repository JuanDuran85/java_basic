package BasicTheory.Oop.src.example_ventas;

public class Sales {
    public static void main(String[] args) {
        System.out.println("*** Sales System ***");

        var product01 = new Products("T-Shirt", 19.99);
        //System.out.println(product01);
        var product02 = new Products("Shoes", 49.99);
        //System.out.println(product02);
        var product03 = new Products("Pants", 9.99);
        //System.out.println(product03);

        // orders
        var order01 = new Orders();
        order01.addProduct(product01);
        order01.addProduct(product02);
        order01.addProduct(product03);
        System.out.println(order01);

        var order02 = new Orders();
        order02.addProduct(new Products("Shoes", 22.99));
        order02.addProduct(new Products("Pants",50.00));
        order02.addProduct(new Products("Dresses", 30.00));
        order02.showOrder();
    }
}
