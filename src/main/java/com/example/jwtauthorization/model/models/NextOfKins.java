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
public class NextOfKins extends BaseEntity {
    private Long userid;
    private String locationid;
    private String relationship;
    private String phonenumber;
    private Long email;
    private String nationalidnumber;


}
