package com.example.demowithdr.entity;

import jakarta.persistence.*;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String doctorname;
	String appointmentdate;
	String status;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(String doctorname, String appointmentdate, String status) {
		super();
		this.doctorname = doctorname;
		this.appointmentdate = appointmentdate;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
}
