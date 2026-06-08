package com.example.demowithdr.entity;

import jakarta.persistence.*;

@Entity
public class Patient {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	int age;
	String disease;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="appointment_id")
	Appointment app;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, int age, String disease, Appointment app) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.app = app;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Appointment getApp() {
		return app;
	}

	public void setApp(Appointment app) {
		this.app = app;
	}
	
	
	
	
	

}
