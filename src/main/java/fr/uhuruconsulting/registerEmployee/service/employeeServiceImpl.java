package fr.uhuruconsulting.registerEmployee.service;

import fr.uhuruconsulting.registerEmployee.exception.NotFoundException;
import fr.uhuruconsulting.registerEmployee.model.Employee;
import fr.uhuruconsulting.registerEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class employeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new NotFoundException("Cet employee n'existe pas !"));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setMatricule(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
