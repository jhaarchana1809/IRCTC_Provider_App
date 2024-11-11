package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.binding.Ticket;
@Repository
public interface Tickets_repository extends JpaRepository<Ticket, Integer> {

}
