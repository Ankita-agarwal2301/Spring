package com.stackroute.spring.ioc.di.model;

import org.springframework.stereotype.Component;

@Component
public class HobbyAW {
	private int id;
	private String name;
	private int since;
	public HobbyAW(int id, String name, int since) {
		
		this.id = id;
		this.name = name;
		this.since = since;
	}
	public HobbyAW() {		
	}
	public int getId() {
		return id;
	}
	public HobbyAW setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public HobbyAW setName(String name) {
		this.name = name;
		return this;
	}
	public int getSince() {
		return since;
	}
	public HobbyAW setSince(int since) {
		this.since = since;
		return this;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", name=" + name + ", since=" + since + "]";
	}
}
