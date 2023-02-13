package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("SELECT COUNT(p) FROM Product p WHERE p.name=:name")
    Long countByName(@Param("name") String name);
}
