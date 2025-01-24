package spb.employees.services;

import spb.employees.model.Employee;

import java.util.List;

public interface IEmployeeServices {
    List<Employee> listEmployees();

    Employee getEmployeeById(Integer id);

    void addOrUpdateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
