package com.stackroute.spring.ioc.di.model;

public class Hobby {
	private int id;
	private String name;
	private int since;
	public Hobby(int id, String name, int since) {
		super();
		this.id = id;
		this.name = name;
		this.since = since;
	}
	public Hobby() {		
	}
	public int getId() {
		return id;
	}
	public Hobby setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Hobby setName(String name) {
		this.name = name;
		return this;
	}
	public int getSince() {
		return since;
	}
	public Hobby setSince(int since) {
		this.since = since;
		return this;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", name=" + name + ", since=" + since + "]";
	}
}
