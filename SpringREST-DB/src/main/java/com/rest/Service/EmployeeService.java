package com.rest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.Controller.EmployeeController;
import com.rest.Model.Employee;
import com.rest.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	public void addEmpInfo(Employee emp) {
		repo.save(emp);
	}
	
	public void deleteEmpIfo(int id) {
		repo.deleteById(id);
	}
	
	public void updateEmpInfo(Employee emp, int id) {
		Optional<Employee> opt = repo.findById(id);
		Employee emp1 = opt.get();
		emp1.seteName(emp.geteName());
		emp1.seteSalary(emp.geteSalary());
		emp1.seteDesignation(emp.geteDesignation());
		
		repo.save(emp1);
	}
	
	public Employee getSingleDataById(int id) {
		return repo.getById(id);
	}
	
	public List<Employee> showAll() {
		return repo.findAll();
	}
}
