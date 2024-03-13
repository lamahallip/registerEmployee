package fr.uhuruconsulting.registerEmployee.controller;

import fr.uhuruconsulting.registerEmployee.model.Employee;
import fr.uhuruconsulting.registerEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>>  getEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.FOUND);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
    @PutMapping(value = "/update")
    public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
