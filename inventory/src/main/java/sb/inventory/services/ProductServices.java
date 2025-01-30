package sb.inventory.services;

import org.springframework.stereotype.Service;
import sb.inventory.model.Product;
import sb.inventory.repository.IProductRepository;

import java.util.List;

@Service
public class ProductServices implements IProductServices {

    private final IProductRepository productRepository;

    public ProductServices(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
