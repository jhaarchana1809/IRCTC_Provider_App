package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.binding.Ticket;
import com.nit.repository.Tickets_repository;
@Service
public class Ticket_service {
	
	@Autowired
	private Tickets_repository ticketRepository;
	//save ticket
	public void saveTicket(Ticket ticket)
	{
		ticketRepository.save(ticket);
	}
	
	//get ticket by id
	
	public Ticket getTicketById(Integer id)
	{
		return ticketRepository.findById(id).orElse(null);
	}

}
