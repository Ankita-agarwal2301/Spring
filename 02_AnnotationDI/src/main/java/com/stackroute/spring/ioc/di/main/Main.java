package com.stackroute.spring.ioc.di.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.spring.ioc.di.config.AppConfig;
import com.stackroute.spring.ioc.di.model.Hobby;
import com.stackroute.spring.ioc.di.model.Student;
import com.stackroute.spring.ioc.di.model.StudentAW;

public class Main {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Student stud1 = context.getBean(Student.class);
	System.out.println(stud1);
	
	Hobby hobby1 = context.getBean("hobby1",Hobby.class);
	System.out.println(hobby1);
	Hobby hobby2 = context.getBean("hobby2",Hobby.class);
	System.out.println(hobby2);
	Hobby hobby3 = context.getBean("hobby3",Hobby.class);
	System.out.println(hobby3);
	
	Hobby hobby11 = context.getBean("hobby11",Hobby.class);
	//builder design pattern
	hobby11.setId(11).setName("aaa").setSince(1998);
	
	Hobby hobby12 = context.getBean("hobby11",Hobby.class);
	hobby12.setId(12).setName("bbb").setSince(1999);
	System.out.println(hobby11);
	System.out.println(hobby12);
	// as it is singleton by default , so same instance overridden . so both instance has same values  . so we used prototype
	
	//example for autowiring
	StudentAW stdAw = context.getBean(StudentAW.class);
	System.out.println(stdAw);

	}
}
