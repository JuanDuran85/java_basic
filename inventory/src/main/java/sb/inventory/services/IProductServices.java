package sb.inventory.services;

import sb.inventory.model.Product;

import java.util.List;

public interface IProductServices {
    List<Product> getAllProducts();

    Product getProductById(Integer id);

    Product addProduct(Product product);

    void deleteProductById(Integer id);
}
