package com.sachin.DatabaseConnWithPostgres.Model;

public class Student {

	public int id;
	public String name;
	public String address;
	public String lang;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
//this is deafualt constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
