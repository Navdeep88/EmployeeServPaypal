package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.repository.EmployeeResourceRepository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	
	@Autowired
	EmployeeResourceRepository employeeResourceRepository;
	
    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

    	  Employee employee = new Employee();
        employee.setId(Integer.valueOf(id));
        employee.setFirstName("BFS");
        employee.setLastName("Developer");
        employee.setDateOfBirth(LocalDate.of( 1979 , 1 , 10 ));

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

	@Override
	public ResponseEntity<Employee> createEmployee(Employee employee) {
		employeeResourceRepository.save(employee);
		 return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Employee> getEmployee(int id) {
		Employee employee=employeeResourceRepository.findById(id).get();
		  return new ResponseEntity<>(employee, HttpStatus.OK);
		
	}
}
