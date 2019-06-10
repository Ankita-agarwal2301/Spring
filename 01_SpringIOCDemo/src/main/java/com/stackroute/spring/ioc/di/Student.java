package com.stackroute.spring.ioc.di;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private int contactNo;
	//private Hobby hobby;
	
//	public Student(int id, String name, String email, int contactNo, Hobby hobby) {
//		//super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.contactNo = contactNo;
//		this.hobby = hobby;
//	}

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", hobby="
//				+ hobby + "]";
//	}
//	
	// as we have no no-arg constructor , so creation of student object is dependent on these members , so Student s2=new Student(); not possible
	private List<Hobby> hobbieslist;
	public Student(int id, String name, String email, int contactNo, List<Hobby> hobbieslist) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.hobbieslist = hobbieslist;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", hobbieslist=" + hobbieslist + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public List<Hobby> getHobbieslist() {
		return hobbieslist;
	}
	public void setHobbieslist(List<Hobby> hobbieslist) {
		this.hobbieslist = hobbieslist;
	}
	
	//Student s1=new Student(1,"aa","a@gmail",122,new Hobby(1,"playing cricket",2000));
	

}
