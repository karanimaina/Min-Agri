package com.example.jwtauthorization.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commission extends BaseEntity {
    private String name;
    private Long financialItemId;
    private Double rate;

}
