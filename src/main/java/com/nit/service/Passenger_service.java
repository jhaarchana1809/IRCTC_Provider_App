package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.binding.Passenger;
import com.nit.repository.Passenger_repository;
@Service
public class Passenger_service {
	
	@Autowired
	private Passenger_repository passengerRepository;
	
	//insert data
	public void insertPassengeData(Passenger passenger)
	{
		passengerRepository.save(passenger);
	}
	
	// get data by id
	
	public Passenger getPassengerById(Integer id)
	{
	Passenger passenger = passengerRepository.findById(id).orElse(null);
	return passenger;		
	}

}
