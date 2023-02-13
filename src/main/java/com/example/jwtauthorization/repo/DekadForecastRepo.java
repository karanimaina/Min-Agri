package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.DekadForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DekadForecastRepo  extends JpaRepository<DekadForecast,Long> {
}
