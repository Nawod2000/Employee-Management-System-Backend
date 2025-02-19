package org.emp.Controllers;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Department;
import org.emp.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    final DepartmentService service;

    @PostMapping("/add-department")
    public void addDepartment(@RequestBody Department department){
        service.addDepartment(department);
    }

    @GetMapping("get-department")
    public List<Department> getAllDepartment(){
        return service.getAllDepartment();
    }
}
