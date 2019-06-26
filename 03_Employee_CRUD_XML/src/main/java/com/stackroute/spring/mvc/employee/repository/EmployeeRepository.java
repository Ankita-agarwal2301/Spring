package com.stackroute.spring.mvc.employee.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.spring.mvc.employee.model.Employee;

//repository layer to perform DB operations
public class EmployeeRepository {
	
	@Override
	public String toString() {
		return "EmployeeRepository [empList=" + empList + "]";
	}

	private List<Employee> empList;
	
	public EmployeeRepository() {
		this.empList = new ArrayList<>();
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public void addEmployee(Employee e){
		this.empList.add(e);
	}
	
	public void deleteEmployee(int empId) {
		this.empList.removeIf(employee -> employee.getId() == empId);
	}
}
