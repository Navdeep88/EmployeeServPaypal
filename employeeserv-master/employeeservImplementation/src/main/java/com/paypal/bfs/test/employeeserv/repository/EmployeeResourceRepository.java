package com.paypal.bfs.test.employeeserv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

public interface EmployeeResourceRepository extends JpaRepository<Employee, Integer> {

}
