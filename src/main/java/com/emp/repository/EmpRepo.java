package com.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emp.entity.EmpEntity;

public interface EmpRepo extends JpaRepository<EmpEntity, Integer> {
	@Query(value="select * from emp_payroll, emp_departments where id = emp_id and department = :department",nativeQuery = true)
	List<EmpEntity> findEmployeeByDept(String department);

}
