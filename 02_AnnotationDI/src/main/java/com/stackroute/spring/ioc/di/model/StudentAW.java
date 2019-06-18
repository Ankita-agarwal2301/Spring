package com.stackroute.spring.ioc.di.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentAW {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", hobby="
				+ hobbyList + "]";
	}
	private int id;
	private String name;
	private String email;
	private int contactNo;
	@Autowired
	@Qualifier("myList")
	private List<Hobby> hobbyList;
	
	public StudentAW()
	{
		
	}
	public StudentAW(int id, String name, String email, int contactNo, List<Hobby> hobby) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.hobbyList = hobby;
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
	
	//if we use HObbyAW - then for 
	//StudentAW stdAw = context.getBean(StudentAW.class);
	//System.out.println(stdAw);
	
	///o/p:
	//Student [id=0, name=null, email=null, contactNo=0, hobby=[Hobby [id=0, name=null, since=0]]]
	
}
