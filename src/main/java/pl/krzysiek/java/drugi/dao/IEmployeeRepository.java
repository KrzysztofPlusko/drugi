package pl.krzysiek.java.drugi.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.drugi.entities.Employee;
import pl.krzysiek.java.drugi.entities.Project;

import java.util.List;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

    public List<Employee> findAll();
}
