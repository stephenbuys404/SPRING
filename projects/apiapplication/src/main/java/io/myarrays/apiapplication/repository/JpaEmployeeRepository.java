package io.myarrays.apiapplication.repository;

import io.myarrays.apiapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee,Integer>{

}
