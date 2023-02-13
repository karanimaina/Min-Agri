package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.FarmerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FarmerDetailsRepo extends JpaRepository<FarmerDetails,Long> {

}
