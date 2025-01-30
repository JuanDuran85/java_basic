package sb.inventory.services;

import sb.inventory.model.Product;

import java.util.List;

public class ProductServices implements IProductServices {
    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void deleteProductById(Integer id) {

    }
}
