package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import lombok.AllArgsConstructor;


@Service  
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
 
	EmployeeRepository repository ;
	


		@Override
	public String saveEmployee(Employee employee) {
			repository.save(employee);
		return "Employee saved!";
	}
 
	@Override
	public String deleteEmployee(int employeeId) {
		repository.deleteById(employeeId);
		return "Employee Deleted!";
	}
 
	@Override
	public String updateEmployee(Employee employee) {
		repository.save(employee);
		return "Updated!";
	}
 
	@Override
	public Employee getEmployee(int employeeId) throws EmployeeNotFound {
 
		Optional<Employee> optional =repository.findById(employeeId);
		if(optional.isEmpty()) {
			throw new EmployeeNotFound("not employeee found with given id...");
		}else {
			return optional.get();
		}
	}
 
	@Override
	public List<Employee> getAllEmployees() {
 
		return repository.findAll();
	}
 

 
	@Override
	public List<Employee>getEmployeesBetweenSal(int intialSal, int finalSal) {
 
		return repository.getEmployeeBetweenSal(intialSal, finalSal);
	}

	@Override
	public List<Employee> getEmployeesByDesg(String empDesg) {

		return repository.getEmployeesByDesg(empDesg);
	}


	
	

}
