package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.Organizations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrganizationRepo extends JpaRepository<Organizations,Long> {
    @Query("SELECT COUNT(o) FROM Organizations o WHERE o.name=:orgname")
    Long countByName(@Param("orgname") String name);


//    List<Organizations> findAllByNameEqualsIgnoreCaseA
}
