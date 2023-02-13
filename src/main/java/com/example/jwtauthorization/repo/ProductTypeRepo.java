package com.example.jwtauthorization.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {
    @Query("SELECT COUNT(pc) FROM ProductCategory pc WHERE pc.name=:name")
    Long countByName(@Param("name") String name);
}
