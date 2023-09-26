package io.myarrays.apiapplication.service.impl;

import java.util.List;

import io.myarrays.apiapplication.model.Employee;
import io.myarrays.apiapplication.repository.InMemoryEmployeeRepository;
import io.myarrays.apiapplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InMemoryEmployeeServiceImpl implements EmployeeService{

	private final InMemoryEmployeeRepository inMemoryEmployeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return inMemoryEmployeeRepository.addEmployee(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return inMemoryEmployeeRepository.getAllEmployees();
	}
	
	@Override
	public Employee findById(Integer id) {
		return inMemoryEmployeeRepository.findById(id);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		InMemoryEmployeeRepository.update(employee);
	}
	
	@Override
	public Boolean deleteById(Integer id) {
		return inMemoryEmployeeRepository.deleteById(id);
	}
}
