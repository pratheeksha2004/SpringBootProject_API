package com.example.demo.service;

import com.example.demo.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Add a new employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public Iterable<Employee> searchByName(String name) {
        return employeeRepository.findByName(name);
    }

    // Get an employee by ID
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    // Get all employees
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Delete an employee by ID
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
