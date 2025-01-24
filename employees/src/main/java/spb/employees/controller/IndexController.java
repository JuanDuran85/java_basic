package spb.employees.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import spb.employees.model.Employee;
import spb.employees.services.EmployeeServices;

import java.util.List;

@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping(value = "/")
    public String init(ModelMap model) {
        logger.info("--- init() method called ---");
        List<Employee> employees = employeeServices.listEmployees();
        employees.forEach(employee -> logger.info(employee.toString()));
        model.put("employees", employees);
        return "index";
    }
}
