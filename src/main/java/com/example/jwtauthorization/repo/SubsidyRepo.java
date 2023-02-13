package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.Subsidy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SubsidyRepo extends JpaRepository<Subsidy,Long> {
    @Query("SELECT COUNT(s) FROM Subsidy s WHERE s.name=:name")
    Long countByName(@Param("name") String name);
}
