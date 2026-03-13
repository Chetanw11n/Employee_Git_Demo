package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cts_emp_info")
@Data  // @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id     // to spefiy primary key
	@Column(name = "empno")
	@Min(value = 1 , message = "EmployeeID cannot  be -ve")
	private int empId;     
	@NotBlank(message = "Emp Name Cannot be Empty/blank/null")
	@Column(name = "ename", nullable = false , length = 10  )
	private String empName;
	@Min(value = 10000 , message = "Salary cannot be below 1000" )
	@Max(value = 100000 , message = "Salary cannot be below 1000" )
	private int empSal;
	@NotEmpty(message = "Designation cannot null/empty")
	private String empDesg;
	

}

