package com.stackroute.spring.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Hobby hobby1 = ctx.getBean("hobby1",Hobby.class);
		System.out.println(hobby1);
		
		Hobby hobby2 = ctx.getBean("hobby2",Hobby.class);
		System.out.println(hobby2);
		
		Student stud1 = ctx.getBean("student1",Student.class);
		System.out.println(stud1);
		
		Student stud2 = ctx.getBean("student2",Student.class);
		System.out.println(stud2);
		
		StudentBO stuBO = ctx.getBean("studentBo1",StudentBO.class);
		System.out.println(stuBO);
		
//		singleton and prototype scope 
		Hobby hobby11 = ctx.getBean("hobby1",Hobby.class);
		System.out.println(hobby11.hashCode());
		Hobby hobby12 = ctx.getBean("hobby1",Hobby.class);
		System.out.println(hobby12.hashCode());
		
		Hobby hobby21 = ctx.getBean("hobby2",Hobby.class);
		System.out.println(hobby21.hashCode());
		Hobby hobby22 = ctx.getBean("hobby2",Hobby.class);
		System.out.println(hobby22.hashCode());
		
		Hobby hobby31 = ctx.getBean("hobby3",Hobby.class);
		System.out.println(hobby31.hashCode());
		Hobby hobby32 = ctx.getBean("hobby3",Hobby.class);
		System.out.println(hobby32.hashCode());
		
		((AbstractApplicationContext)ctx).close();
	
	}

}
