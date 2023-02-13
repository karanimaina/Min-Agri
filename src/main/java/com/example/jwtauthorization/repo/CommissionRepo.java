package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommissionRepo extends JpaRepository<Commission,Long> {
}

