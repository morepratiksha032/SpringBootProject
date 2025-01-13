package com.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
