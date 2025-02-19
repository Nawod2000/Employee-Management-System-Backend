package org.emp.Controllers;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Role;
import org.emp.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    final RoleService service;

    @PostMapping("/add-Role")
    public void addRole(@RequestBody Role role){
        service.addRole(role);
    }

    @GetMapping("/get-role")
    public List<Role> getRole(){
        return service.getAll();
    }

    @DeleteMapping("/delete-by-role/{id}")
    public boolean deleteByRoleId(@PathVariable Long id){
        return service.deleteByRoleId(id);

    }

}
