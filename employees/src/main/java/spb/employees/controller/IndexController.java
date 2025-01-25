package spb.employees.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        model.put("employees", employees);
        return "index";
    }

    @GetMapping(value = "/add-employee")
    public String add(ModelMap model) {
        logger.info("--- add() method called ---");
        return "addEmployee";
    }

    @PostMapping(value = "/add-employee")
    public String addEmployee(@ModelAttribute("postEmployee") Employee employee) {
        logger.info("--- addEmployee() method called ---");
        employeeServices.addOrUpdateEmployee(employee);
        return "redirect:/";
    }
}
