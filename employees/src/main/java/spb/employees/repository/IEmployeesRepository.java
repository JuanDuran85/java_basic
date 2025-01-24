package spb.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spb.employees.model.Employee;

public interface IEmployeesRepository extends JpaRepository<Employee, Integer> {
}
