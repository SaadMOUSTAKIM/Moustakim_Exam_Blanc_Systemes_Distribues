package com.example.immatriculation_querie_service.repositories;


import com.example.immatriculation_querie_service.entities.Vehicle;
import com.example.immatriculation_querie_service.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findVehicleByOwner(VehicleOwner vehicleOwner);
}
