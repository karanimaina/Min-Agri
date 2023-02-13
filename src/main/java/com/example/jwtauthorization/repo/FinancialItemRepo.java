package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.FinancialItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FinancialItemRepo extends JpaRepository<FinancialItem,Long> {
//    @Query("SELECT COUNT(fi) FROM FinancialItem fi WHERE fi.name=:name")
    Long countByName( String name);
}

