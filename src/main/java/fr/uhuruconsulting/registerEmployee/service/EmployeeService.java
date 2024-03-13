package fr.uhuruconsulting.registerEmployee.service;

import fr.uhuruconsulting.registerEmployee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployee(Long id);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
