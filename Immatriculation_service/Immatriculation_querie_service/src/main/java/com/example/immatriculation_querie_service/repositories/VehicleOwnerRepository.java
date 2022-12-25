package com.example.immatriculation_querie_service.repositories;


import com.example.immatriculation_querie_service.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, String> {
    VehicleOwner findByOwnerNationalIdCard(String nationalIdCard );
}
