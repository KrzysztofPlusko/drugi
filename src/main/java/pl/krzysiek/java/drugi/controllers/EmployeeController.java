package pl.krzysiek.java.drugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.drugi.dao.IEmployeeRepository;
import pl.krzysiek.java.drugi.entities.Employee;

import javax.persistence.GeneratedValue;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeRepository iEmpRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {

        Employee anEmployee = new Employee();

        model.addAttribute("employee",anEmployee);

        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(Employee employee, Model model) {

        iEmpRepo.save(employee);

        return "redirect:/employees/new";
        }
    }


