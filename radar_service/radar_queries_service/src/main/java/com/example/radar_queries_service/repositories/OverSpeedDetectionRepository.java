package com.example.radar_queries_service.repositories;


import com.example.radar_queries_service.entities.OverSpeedDetection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OverSpeedDetectionRepository extends JpaRepository<OverSpeedDetection,String> {
    List<OverSpeedDetection> findByVehicleRegistrationNumber(String regNumber);
}
