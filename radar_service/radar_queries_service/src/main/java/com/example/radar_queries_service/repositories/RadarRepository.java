package com.example.radar_queries_service.repositories;

import com.example.radar_queries_service.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,String> {
}
