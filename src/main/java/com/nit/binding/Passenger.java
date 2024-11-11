package com.nit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Data
@Entity
public class Passenger {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passenger_seq")
    @SequenceGenerator(name = "passenger_seq",
        initialValue = 1,
        sequenceName = "passenger_seq", 
        allocationSize = 1)
    @Id
    private Integer id;

    private String name;
    private int age;

    // Rename fields to avoid reserved keywords
    private String fromLocation;
    private String toLocation;
    private int trainNo;
}
