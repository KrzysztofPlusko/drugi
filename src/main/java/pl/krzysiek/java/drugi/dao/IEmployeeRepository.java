package pl.krzysiek.java.drugi.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.drugi.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
