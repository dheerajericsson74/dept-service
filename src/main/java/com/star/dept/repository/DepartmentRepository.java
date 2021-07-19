package com.star.dept.repository;

//import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.dept.entity.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department getByDeptId(long deptId);

}
