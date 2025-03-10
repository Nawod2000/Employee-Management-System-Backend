package org.emp.service;

import org.emp.dto.Employee;
import org.emp.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getAll();

    void deleteEmployeeById(String id);

    void updateEmployee(Employee employee);

    Employee findById(String id);

    Employee findByFirstName(String firstName);
}
