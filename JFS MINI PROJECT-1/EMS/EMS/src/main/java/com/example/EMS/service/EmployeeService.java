package com.example.EMS.service;

import com.example.EMS.model.Employee;
import com.example.EMS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees (for admin dashboard)
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by employeeId
    public Optional<Employee> getEmployeeByEmployeeId(String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    // Add new employee
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    // Edit employee details
    public void editEmployee(String employeeId, Employee updatedEmployee) {
        Optional<Employee> existingEmployee = employeeRepository.findByEmployeeId(employeeId);
        if (existingEmployee.isPresent()) {
            Employee employee = existingEmployee.get();
            employee.setName(updatedEmployee.getName());
            employee.setLocation(updatedEmployee.getLocation());
            employee.setContact(updatedEmployee.getContact());
            employeeRepository.save(employee);  // Save the updated employee details
        }
    }

    // Delete employee by employeeId
    public void deleteEmployee(String employeeId) {
        Optional<Employee> employee = employeeRepository.findByEmployeeId(employeeId);
        if (employee.isPresent()) {
            employeeRepository.deleteById(employee.get().getId());  // Delete employee by _id
        } else {
            throw new IllegalArgumentException("Employee not found with ID: " + employeeId);
        }
    }
}
