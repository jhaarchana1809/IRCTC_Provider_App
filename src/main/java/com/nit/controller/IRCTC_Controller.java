package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.binding.Passenger;
import com.nit.binding.Ticket;
import com.nit.service.Passenger_service;
import com.nit.service.Ticket_service;
@RestController
public class IRCTC_Controller {
	
	@Autowired
	private Ticket_service ticketService;
	
	@Autowired
	private Passenger_service passengerService;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> savePassenger(@RequestBody Passenger passenger)
	{
		passengerService.insertPassengeData(passenger);
		Ticket t= new Ticket();
		t.setAge(passenger.getAge());
		t.setName(passenger.getName());
		t.setTrainNo(passenger.getTrainNo());
		t.setCost(100);
		t.setTo(passenger.getToLocation());
		t.setFrom(passenger.getFromLocation());
		ticketService.saveTicket(t);
		return new ResponseEntity<Ticket>(t, HttpStatus.OK);
	}
	
	
	@GetMapping("/ticket/{id}")
	public ResponseEntity<Ticket> getTicket(@PathVariable Integer id)
	{
		Ticket ticket = ticketService.getTicketById(id);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
	

}
