package com.example.jwtauthorization.model.models;

import com.example.jwtauthorization.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization extends BaseEntity {
    private String name;
   private Long organizationType;
   private Long locationId;
   private String website;
   private String email;
   private  String phoneNumber;
   private String registrationNumber;
    private String licenseNumber;
   private Long contactUserId;


}
