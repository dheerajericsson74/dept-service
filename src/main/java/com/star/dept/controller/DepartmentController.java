package com.star.dept.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.dept.entity.Department;
import com.star.dept.service.DepartmentService;



@RestController
@RequestMapping("/depts")
public class DepartmentController {
    
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDept(@RequestBody Department dept) {
		System.out.println(" inside @RestController saveDept ... ");
		
		return departmentService.saveDepartment(dept);
		
	}
	@GetMapping("/{id}")
	public Department getDeptById(@PathVariable("id") Long deptId) {
		
		System.out.println(" inside @RestController getDeptById ... ");
		return departmentService.getDeptById(deptId);
		
	} 
	@GetMapping("/all")
	public List<Department> getAllDept() {
		
		System.out.println(" inside @RestController getAllDept ... ");
		return departmentService.getAllDept();
		
	} 
}
