package sb.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sb.inventory.model.Product;

public interface IProductRepository extends JpaRepository<Product,Integer> {

}
