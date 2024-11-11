package com.nit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Ticket {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
	@SequenceGenerator(name = "ticket_seq",
	initialValue = 1,
	sequenceName = "ticket_seq", 
	allocationSize = 1)
	@Id
	private Integer id;
	private String name;
	private int age;
	private int trainNo;
	private double cost;
	@Column(name = "from_location")
	private String from;

	@Column(name = "to_location")
	private String to;	

}
