package com.moustakim.infraction_command_service.repositories;

import com.moustakim.infraction_command_service.model.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner,String> {
}
