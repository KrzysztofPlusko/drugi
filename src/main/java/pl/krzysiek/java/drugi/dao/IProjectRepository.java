package pl.krzysiek.java.drugi.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.drugi.entities.Project;

import java.util.List;

public interface IProjectRepository extends CrudRepository<Project, Long> {
    public List<Project> findAll();
}
