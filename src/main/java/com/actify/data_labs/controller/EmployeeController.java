package com.actify.data_labs.controller;

import com.actify.data_labs.entity.Employee;
import com.actify.data_labs.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/addEmployee")
    public Employee addTask(@RequestBody Employee employee) {
        return employeeService.addNewTask(employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public void deleteEmployee(@PathVariable Long employeeId) {
         employeeService.deleteEmployee(employeeId);
        System.out.println("Safely Deleted");
    }

    @GetMapping("/listAllEmployees")
    public List<Employee> getAllEmplyoees() {
        return employeeService.getAllEmployees();
    }

}
