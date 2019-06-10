package com.stackroute.spring.ioc.di;

public class Hobby {
	private int id;
	private String name;
	private int since;
	public Hobby(int id, String name, int since) {
		//super();
		this.id = id;
		this.name = name;
		this.since = since;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", name=" + name + ", since=" + since + "]";
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
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	public void setUp()
	{System.out.println("inside set up..........");
	}
	public void cleanUp()
	{System.out.println("inside clean up........");
	}
	

}
