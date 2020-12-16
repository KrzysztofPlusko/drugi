package pl.krzysiek.java.drugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.krzysiek.java.drugi.dao.IEmployeeRepository;
import pl.krzysiek.java.drugi.dao.IProjectRepository;
import pl.krzysiek.java.drugi.entities.Employee;
import pl.krzysiek.java.drugi.entities.Project;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    IProjectRepository iProRepo;

    @Autowired
    IEmployeeRepository iEmpRepo;

    @GetMapping("/")
    public String displayProjectsList(Model model) {

        List<Project> projects = iProRepo.findAll();
        model.addAttribute("projects", projects);

        List<Employee> employees = iEmpRepo.findAll();
        model.addAttribute("employees", employees);

        return "home";
    }


}
