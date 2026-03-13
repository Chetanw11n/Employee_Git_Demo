package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  // Entity class
{

	// Persist() , merge() ,remove(),find()-->1 row operations
	// createQuery() --> for multi row operations

	@Query("Select e from Employee e where e.empDesg=:empDesg")
	public abstract List<Employee> getEmployeesByDesg(String empDesg);

	@Query("Select e from Employee e where e.empSal BETWEEN :intialSal and :finalSal")
	public abstract List<Employee> getEmployeeBetweenSal(int intialSal, int finalSal);

	

}
