package org.emp.employeeController;


import org.emp.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {

    List<Employee> empList=new ArrayList();

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        empList.add(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return empList;
    }
}
