package com.stackroute.spring.ioc.di.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import com.stackroute.spring.ioc.di.model.Hobby;
import com.stackroute.spring.ioc.di.model.Student;

// beans config class (file similar to xml)

@Configuration
@ComponentScan(basePackages="com.stackroute.spring.ioc.di.model")
public class AppConfig {

	//bean definition
	//dependencies , scope , init-method , destroy method
	
	@Bean
	public Student getStudent1()
	{
		System.out.println("getStudent1");
		//return new Student(0, "aaa","a@gmail", 0, getHobby1()); // if hobby is not a list
		return new Student(0, "aaa","a@gmail", 0, new ArrayList<>(Arrays.asList(getHobby1(),getHobby2(),getHobby3())));
		
	}
	
	@Bean("hobby1")
	@Scope("prototype")
	public Hobby getHobby1()
	{
		System.out.println("getHobby1");
		return new Hobby(1, "cricket", 2016);
		
	}
	
	@Bean("hobby2")
	@Qualifier("myList")
	@Order(2)
	public Hobby getHobby2()
	{
		System.out.println("getHobby2");
		return new Hobby(2, "book", 2017);
		
	}
	
	@Bean("hobby3")
	@Qualifier("myList")
	@Order(1)
	public Hobby getHobby3()
	{
		System.out.println("getHobby3");
		return new Hobby(3, "chess", 2018);
		
	}
	
	
	@Bean("hobby11")
	@Scope("prototype")
	public Hobby getHobby11()
	{
		System.out.println("getHobby11");
		return new Hobby();
		
	}
	
}
