package io.myarrays.apiapplication.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.myarrays.apiapplication.model.Employee;

@Repository
public class InMemoryEmployeeRepository {

	private static final List<Employee> DATABASE = new ArrayList<>();

	static {
		DATABASE.add(new Employee(1,"John","Smith","email"));
		DATABASE.add(new Employee(2,"Alex","Smith","email"));
		DATABASE.add(new Employee(3,"David","Smith","email"));
	}
	
	public Employee addEmployee(Employee employee) {
    	DATABASE.add(employee);
    	return employee;
    }
	
	public List<Employee> getAllEmployees(){
		return List.copyOf(DATABASE);
	}
	
	public Employee findById(Integer id) {
		return DATABASE
				.stream()
				.filter(emp->id.equals(emp.getId()))
				.findFirst()
				.orElseThrow();
	}
	
	public void UpdateEmployee(Employee employee) {
		
	}
	
	public Boolean deleteById(Integer id) {
		Employee employee = DATABASE
				.stream()
				.filter(emp->id.equals(emp.getId()))
				.findFirst()
				.orElseThrow();
		DATABASE.remove(employee);
		return true;
	}
}
