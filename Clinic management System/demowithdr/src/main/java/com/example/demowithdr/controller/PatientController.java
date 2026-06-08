package com.example.demowithdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import com.example.demowithdr.entity.*;

import com.example.demowithdr.service.*;


@RestController
public class PatientController {

	@Autowired
	PatientService ps;
	
	@PostMapping("/store")
	public Patient get1(@RequestBody Patient p)
	{
		
		return ps.savepatient(p);
	}
	
	@GetMapping("/show")
	public List<Patient> get2()
	{
		return ps.getAllPatient();
	}
	
	
	@GetMapping("/part/{id}")
	public Patient get3(@PathVariable int id)
	{
		return ps.getParticularPatient(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void get4(@PathVariable int id)
	{
		ps.patientdelete(id);
	}
	
	
}
