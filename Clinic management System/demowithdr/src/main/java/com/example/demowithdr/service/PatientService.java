package com.example.demowithdr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demowithdr.entity.*;
import com.example.demowithdr.dao.*;
import java.util.*;


@Service
public class PatientService {

	@Autowired
	PatientRepo r;
	
	//save
	public Patient savepatient(Patient p)
	{
		return r.save(p);
	}
	//view
	public List<Patient> getAllPatient()
	{
		return r.findAll();
	}
	
	//single element
	public Patient getParticularPatient(int id)
	{
		return r.findById(id).orElse(null);
	}
	//delete
	
	public void patientdelete(int id)
	{
		r.deleteById(id);
	}
	
}
