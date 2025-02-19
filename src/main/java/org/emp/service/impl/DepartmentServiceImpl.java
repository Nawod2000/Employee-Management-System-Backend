package org.emp.service.impl;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Department;
import org.emp.entity.DepartmentEntity;
import org.emp.repository.DepartmentRepository;
import org.emp.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    final DepartmentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addDepartment(Department department) {
        repository.save(mapper.map(department, DepartmentEntity.class));
    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> list = new ArrayList<>();
        repository.findAll().forEach(obj->{
            list.add(mapper.map(obj, Department.class));
        });
        return list;
    }

    @Override
    public boolean deleteByDepartmentId(Long id) {
        repository.deleteById(id);
        return true;
    }
}
