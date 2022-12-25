package com.moustakim.infraction_command_service.repositories;


import com.moustakim.infraction_command_service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}
