package com.example.infraction_querie_service.repositories;


import com.example.infraction_querie_service.entities.Infraction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,String> {
    Page<Infraction> findAllByOwnerNationalCardId(String ncID, Pageable pageable);
}
