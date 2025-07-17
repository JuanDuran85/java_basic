package strategy_pattern_package.controller;

import strategy_pattern_package.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Payment {
    List<Product> productList;

    public ShoppingCart(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public Float calculateTotal(){
        Float sum = 0.0f;
        for (Product product: productList){
            sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public void pay(int amount) {
        float amountTotal = calculateTotal();
    }
}
