package com.stackroute.spring.ioc.di;

import java.util.List;
import java.util.Map;

public class StudentBO {
	
	public StudentBO(Map<Student, List<Hobby>> studentHobbiesMap) {
		//super();
		this.studentHobbiesMap = studentHobbiesMap;
	}

	private Map<Student,List<Hobby>> studentHobbiesMap;

	public Map<Student,List<Hobby>> getStudentHobbiesMap() {
		return studentHobbiesMap;
	}

	public void setStudentHobbiesMap(Map<Student,List<Hobby>> studentHobbiesMap) {
		this.studentHobbiesMap = studentHobbiesMap;
	}

	@Override
	public String toString() {
		return "StudentBO [studentHobbiesMap=" + studentHobbiesMap + "]";
	}
}
