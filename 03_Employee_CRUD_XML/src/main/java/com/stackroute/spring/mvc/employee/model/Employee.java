package com.stackroute.spring.mvc.employee.model;

public class Employee {
private int id;
private String empName;
private String empEmail;
private int empContactNo;

@Override
public String toString() {
	return "Employee [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + ", empContactNo=" + empContactNo
			+ "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public int getEmpContactNo() {
	return empContactNo;
}
public void setEmpContactNo(int empContactNo) {
	this.empContactNo = empContactNo;
}
}
