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
public class Organizations extends BaseEntity {
    String name;
    Long orgtype;
    Long locationid;
    String website;
    String email;
    String phonenumber;
    String registrationnumber;
    String licensenumber;
    Long contactuserid;


}
