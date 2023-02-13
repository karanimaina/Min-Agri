package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductTypeRepo extends JpaRepository<ProductType,Long> {
    @Query("SELECT COUNT(pt) FROM ProductType pt WHERE pt.name=:name")
    Long countByName(@Param("name") String name);
}
