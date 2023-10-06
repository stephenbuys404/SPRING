package io.myarrays.apiapplication.service;

import java.util.List;

import io.myarrays.apiapplication.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee findById(Integer id);
	
	void UpdateEmployee(Employee employee);
	
	Boolean deleteById(Integer id);
}
