package sb.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sb.inventory.exceptions.NotFoundException;
import sb.inventory.model.Product;
import sb.inventory.services.IProductServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Product addProduct(@RequestBody Product product) {
        logger.info("{}", product);
        return this.productServices.addProduct(product);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = this.productServices.getProductById(id);
        if (product == null) {
            throw new NotFoundException("Product not found with id: " + id);
        }
        return ResponseEntity.ok().body(product);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product requestProduct) {
        Product product = this.productServices.getProductById(id);

        if (product == null) {
            throw new NotFoundException("Product not found with id: " + id);
        }

        product.setDescription(requestProduct.getDescription());
        product.setPrice(requestProduct.getPrice());
        product.setStock(requestProduct.getStock());
        this.productServices.addProduct(product);

        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteProduct(@PathVariable int id) {
        Product product = this.productServices.getProductById(id);

        if (product == null) {
            throw new NotFoundException("Product not found with id: " + id);
        }

        this.productServices.deleteProductById(id);
        Map<String, Boolean> responseEntity = new HashMap<>();
        responseEntity.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(responseEntity);
    }
}
