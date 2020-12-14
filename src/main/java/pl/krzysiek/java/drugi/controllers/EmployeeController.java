package pl.krzysiek.java.drugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import pl.krzysiek.java.drugi.dao.IEmployeeRepository;
import pl.krzysiek.java.drugi.entities.Employee;

public class EmployeeController {

    @Autowired
    IEmployeeRepository iEmpRepo;

    public String displayEmployeeForm(Model model) {

        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee";
    }
}
