package com.stackroute.spring.ioc.di.model;

import java.util.List;

public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", hobby="
				+ hobbyList + "]";
	}
	private int id;
	private String name;
	private String email;
	private int contactNo;
	private List<Hobby> hobbyList;
	
	public Student(int id, String name, String email, int contactNo, List<Hobby> hobby) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.hobbyList = hobby;
	}
public Student() {
		// TODO Auto-generated constructor stub
	}
	//	public Hobby getHobby() {
//		return hobbyList;
//	}
//	public void setHobby(Hobby hobby) {
//		this.hobbyList = hobby;
//	}
	public List<Hobby> getHobbyList() {
		return hobbyList;
	}
	public void setHobbyList(List<Hobby> hobbyList) {
		this.hobbyList = hobbyList;
	}
	
}
