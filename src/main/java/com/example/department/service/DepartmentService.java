package com.example.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public Department saveDepartment(Department dep ) {
		return departmentRepo.save(dep);
	}


	public Department findDepartmentById(Long depId) {
		return departmentRepo.findDepartmentById(depId);
	}
}
