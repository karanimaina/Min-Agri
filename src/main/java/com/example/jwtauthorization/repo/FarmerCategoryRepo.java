package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.FarmerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

    public interface FarmerCategoryRepo extends JpaRepository<FarmerCategory, Long> {
    @Query("SELECT COUNT(o) FROM FarmerCategory o WHERE o.name=:name")
    Long countByName(String name);
}