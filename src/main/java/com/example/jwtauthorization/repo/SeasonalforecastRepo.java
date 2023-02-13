package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.SeasonalForecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonalforecastRepo extends JpaRepository<SeasonalForecast,Long> {
}
