package com.actify.data_labs.service;

import com.actify.data_labs.entity.Employee;
import com.actify.data_labs.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addNewTask(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
