package com.star.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.dept.entity.Department;
import com.star.dept.repository.DepartmentRepository;
//'com.star.deptservice.DepartmentService
@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department dept) {
		System.out.println(" inside DepartmentService  saveDepartment ... " +dept.toString());
		Department deptRes = null;
		try {
			deptRes = departmentRepository.save(dept);
			
			System.out.println(" inside DepartmentService  saveDepartment deptRes ---->  " +deptRes.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return deptRes;
	}

	public Department getDeptById(long deptId) {
		System.out.println(" inside DepartmentService  saveDepartment ... " +deptId);
		return departmentRepository.getByDeptId(deptId );
	}

	public List<Department> getAllDept() {
		System.out.println(" inside DepartmentService  saveDepartment ... " );
		return departmentRepository.findAll()   ;
	} 
}
