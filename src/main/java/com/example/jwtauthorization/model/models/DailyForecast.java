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

public class DailyForecast extends BaseEntity {
    String district;
    String period;
    String element;
    String description;
    String forecast;
    String date;


}
