package com.example.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	
	@Autowired
	private DepartmentService depService;
	
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dep) {
	//	log.info("Inside Save department.");
		System.out.println("InputDept:"+dep.toString());
		Department outputDep = depService.saveDepartment(dep);
		System.out.println("OutputDep:"+outputDep.toString());
		return outputDep;
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") String id) {
		Long depId = new Long(id);
		return depService.findDepartmentById(depId);
	}
} 
