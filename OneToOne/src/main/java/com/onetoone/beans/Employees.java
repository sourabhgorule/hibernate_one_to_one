package com.onetoone.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employees {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Laptop laptop;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
	
}
