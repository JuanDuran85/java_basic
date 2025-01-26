package spb.employees.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        logger.info("--- addEmployee() get method called ---");
        return "addEmployee";
    }

    @PostMapping(value = "/add-employee")
    public String addEmployee(@ModelAttribute("postEmployee") Employee employee) {
        logger.info("--- addEmployee() post method called ---");
        employeeServices.addOrUpdateEmployee(employee);
        return "redirect:/";
    }

    @GetMapping(value= "/edit-employee")
    public String edit(@RequestParam int employeeId, ModelMap model) {
        logger.info("--- edit() get method called ---");
        Employee employee = employeeServices.getEmployeeById(employeeId);
        model.put("employee", employee);
        return "editEmployee";
    }

    @PostMapping(value = "/edit-employee")
    public String editEmployee(@ModelAttribute("postEmployee") Employee employee) {
        logger.info("--- editEmployee() post method called ---");
        employeeServices.addOrUpdateEmployee(employee);
        return "redirect:/";
    }

    @GetMapping(value = "/delete-employee")
    public String delete(@RequestParam int employeeId) {
        logger.info("--- delete() get method called ---");
        Employee employee = employeeServices.getEmployeeById(employeeId);
        employeeServices.deleteEmployee(employee);
        return "redirect:/";
    }
}
