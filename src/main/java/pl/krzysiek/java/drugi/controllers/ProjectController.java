package pl.krzysiek.java.drugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.drugi.dao.IProjectRepository;
import pl.krzysiek.java.drugi.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectRepository iProRepo;

    @GetMapping("new")
    public String displayProjectForm(Model model) {

        Project aProject = new Project();

        model.addAttribute("project", aProject);

        return "new-project";
    }

    @PostMapping("save")
    public String createProject(Project project, Model model) {

        iProRepo.save(project);
        return "redirect:/projects/new";
    }
}
