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
public class DekadForecast extends BaseEntity {

    String district;
    double dekad;
    String startday;
    String endday;
    String rainfallrange;
    String windspeed;
    String temparature;


}

