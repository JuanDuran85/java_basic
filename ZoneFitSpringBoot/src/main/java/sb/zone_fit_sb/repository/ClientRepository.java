package sb.zone_fit_sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sb.zone_fit_sb.model.Client;

// the second parameter of JpaRepository is the type of the primary key
public interface ClientRepository extends JpaRepository<Client, Integer> {



}
