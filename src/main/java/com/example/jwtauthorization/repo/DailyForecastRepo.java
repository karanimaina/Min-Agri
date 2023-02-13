package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.DailyForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyForecastRepo  extends JpaRepository<DailyForecast,Long> {
}
