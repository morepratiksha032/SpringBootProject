package com.rest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int eId;
	String eName;
	double eSalary;
	String eDesignation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eId, String eName, double eSalary, String eDesignation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDesignation=" + eDesignation
				+ "]";
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}	
}
