package org.emp.service;

import org.emp.dto.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    List<Role> getAll();

    boolean deleteByRoleId(Long id);
}
