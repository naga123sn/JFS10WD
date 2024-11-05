package com.example.EMS.controller;

import com.example.EMS.model.Employee;
import com.example.EMS.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Admin Dashboard - Show all employees
    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "admin-dashboard";
    }

    // Add new employee form
    @GetMapping("/admin/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    // Add new employee
    @PostMapping("/admin/add")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/admin";  // Redirect to admin dashboard after adding
    }

    // Edit employee form (for editing existing employee details)
    @GetMapping("/admin/edit/{employeeId}")
    public String showEditEmployeeForm(@PathVariable String employeeId, Model model) {
        Optional<Employee> employee = employeeService.getEmployeeByEmployeeId(employeeId);
        if (employee.isPresent()) {
            model.addAttribute("employee", employee.get());
            return "edit-employee";  // Show the edit employee form
        }
        return "redirect:/admin";  // If employee not found, redirect to admin dashboard
    }

    // Handle editing employee details
    @PostMapping("/admin/edit")
    public String editEmployee(@ModelAttribute Employee employee) {
        employeeService.editEmployee(employee.getEmployeeId(), employee);
        return "redirect:/admin";  // Redirect to admin dashboard after editing
    }

    // Delete employee
    @GetMapping("/admin/delete/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId, RedirectAttributes redirectAttributes) {
        try {
            employeeService.deleteEmployee(employeeId);  // Call service method to delete the employee
            redirectAttributes.addFlashAttribute("message", "Employee deleted successfully.");
        } catch (IllegalArgumentException e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());  // Handle error if employee not found
        }
        return "redirect:/admin";  // Redirect to admin dashboard after deletion attempt
    }

    // Employee Home Page (For employees to view their details)
    @GetMapping("/employee")
    public String showEmployeeHome() {
        return "employee-home";  // Show the employee home page
    }

    // Show employee details based on employeeId entered by the employee
    @PostMapping("/employee")
    public String showEmployeeDetails(@RequestParam String employeeId, Model model) {
        Optional<Employee> employee = employeeService.getEmployeeByEmployeeId(employeeId);
        if (employee.isPresent()) {
            model.addAttribute("employee", employee.get());  // Show employee details if found
            return "employee-home";
        } else {
            model.addAttribute("error", "Employee ID not found!");  // Show error if employee ID not found
            return "employee-home";
        }
    }
}
