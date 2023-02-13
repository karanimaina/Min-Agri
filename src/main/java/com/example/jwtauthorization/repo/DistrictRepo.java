package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.location.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepo extends JpaRepository<District,Long> {
}
