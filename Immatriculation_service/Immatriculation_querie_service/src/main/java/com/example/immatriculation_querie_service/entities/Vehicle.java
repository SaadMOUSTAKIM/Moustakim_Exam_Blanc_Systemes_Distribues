package com.example.immatriculation_querie_service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicle {
    @Id
    private String registrationNumber;
    private String brand;
    private String model;
    private  int  fiscalPower;
    @ManyToOne( fetch = FetchType.EAGER)
    private VehicleOwner owner;
}
