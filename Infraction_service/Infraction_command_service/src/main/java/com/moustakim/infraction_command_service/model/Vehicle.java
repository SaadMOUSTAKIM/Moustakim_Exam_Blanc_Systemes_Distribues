package com.moustakim.infraction_command_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Vehicle {
    @Id
    private String registrationNumber;
    private String model;
    private int fiscalPower;
    @ManyToOne
    private VehicleOwner vehicleOwner;
}
