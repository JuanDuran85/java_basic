package sb.inventory.services;

import sb.inventory.model.Product;

import java.util.List;

public interface IProductServices {
    public List<Product> getAllProducts();

    public Product getProductById(Integer id);

    public Product addProduct(Product product);

    public void deleteProductById(Integer id);
}
