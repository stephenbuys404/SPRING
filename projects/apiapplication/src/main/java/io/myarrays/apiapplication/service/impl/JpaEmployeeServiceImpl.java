package io.myarrays.apiapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.myarrays.apiapplication.model.Employee;
import io.myarrays.apiapplication.repository.JpaEmployeeRepository;
import io.myarrays.apiapplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class JpaEmployeeServiceImpl implements EmployeeService{

	private final JpaEmployeeRepository jpaEmployeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return jpaEmployeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jpaEmployeeRepository.findAll();
	}

	@Override
	public Employee findById(Integer id) {
		return jpaEmployeeRepository.findById(id).get();
	}

	@Override
	public void UpdateEmployee(Employee employee) {
		
	}

	@Override
	public Boolean deleteById(Integer id) {
		jpaEmployeeRepository.deleteById(id);
		return true;
	}

}
