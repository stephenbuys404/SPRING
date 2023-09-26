package io.myarrays.apiapplication.resource;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.myarrays.apiapplication.service.EmployeeService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/api/employees")
public class EmployeeResource {
	private final EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees(){
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
		return ResponseEntity.ok(employeeService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee){
		employee.setId(employeeService.getAllEmployees().size()+1);
		return ResponseEntity.created(getLocation(employee.getId())).body(employeeService.addEmployees(employee));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable("id") Integer id){
		return ResponseEntity.ok(employeeService.deleteById(id));
	}
	
	@PutMapping
	public ResponseEntity<Boolean> updateEmployee(){
		return null;
	}
	
	private URI getLocation(Integer id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(id).toUri();
	}
	
	/*@GetMapping
	public ResponseEntity<List<Employee>> getEmployees(){
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}*/
}
