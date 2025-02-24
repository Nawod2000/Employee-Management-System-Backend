package org.emp.repository;

import org.emp.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {
    EmployeeEntity findByFirstName(String firstName);
}
