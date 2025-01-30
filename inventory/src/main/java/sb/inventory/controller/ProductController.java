package sb.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import sb.inventory.model.Product;
import sb.inventory.services.IProductServices;

import java.util.List;

@RestController
@RequestMapping("/products-app")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final IProductServices productServices;

    public ProductController(IProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        logger.info("---- Getting all products ----");
        List<Product> products = this.productServices.getAllProducts();
        products.forEach(product -> logger.info(product.toString()));
        return this.productServices.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        logger.info("{}",product);
        return this.productServices.addProduct(product);
    }
}
