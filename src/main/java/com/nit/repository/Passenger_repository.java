package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.binding.Passenger;
@Repository
public interface Passenger_repository extends JpaRepository<Passenger, Integer>{

}
