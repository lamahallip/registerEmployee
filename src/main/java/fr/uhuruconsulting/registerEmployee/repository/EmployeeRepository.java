package fr.uhuruconsulting.registerEmployee.repository;

import fr.uhuruconsulting.registerEmployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
