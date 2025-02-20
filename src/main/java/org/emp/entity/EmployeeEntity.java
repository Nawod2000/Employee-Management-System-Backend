package org.emp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.emp.dto.Role;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id" , referencedColumnName = "id")
    private RoleEntity role;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<DepartmentEntity> departmentList;
}
