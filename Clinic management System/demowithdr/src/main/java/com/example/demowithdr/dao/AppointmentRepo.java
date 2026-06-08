package com.example.demowithdr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demowithdr.entity.*;
public interface AppointmentRepo  extends JpaRepository<Appointment,Integer>{

}
