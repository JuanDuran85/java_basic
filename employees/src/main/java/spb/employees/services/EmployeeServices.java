package spb.employees.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spb.employees.model.Employee;
import spb.employees.repository.IEmployeesRepository;

import java.util.List;

@Service
public class EmployeeServices implements IEmployeeServices {

    @Autowired
    private IEmployeesRepository iEmployeesRepository;

    @Override
    public List<Employee> listEmployees() {
        return iEmployeesRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
       return iEmployeesRepository.findById(id).orElse(null);
    }

    @Override
    public void addOrUpdateEmployee(Employee employee) {
        iEmployeesRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        iEmployeesRepository.delete(employee);
    }
}
