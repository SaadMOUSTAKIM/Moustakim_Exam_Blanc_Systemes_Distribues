package com.example.infraction_querie_service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Infraction {
   @Id
   private String contraventionId;
   private Instant instant;
   private String radarId;
   private double radarLong;
   private double radarLat;
   private String vehicleRegistrationNumber;
   private int vehicleSpeed;
   private int radarMaxSpeed;
   private String ownerNationalCardId;
   private double amount;
   private String vehicleOwner;
   private Date ownerBirthDay;
   private String ownerEmail;
   private String ownerPhoneNumber;
   private  String ownerAddress;

}
