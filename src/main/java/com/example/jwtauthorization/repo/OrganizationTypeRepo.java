package com.example.jwtauthorization.repo;


import com.example.jwtauthorization.model.models.OrganizationTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrganizationTypeRepo extends JpaRepository<OrganizationTypes,Long> {
    @Query("SELECT COUNT(o) FROM OrganizationTypes o WHERE o.name=:orgname")
    Long countByName(@Param("orgname") String name);

    List<OrganizationTypes> findAllByNameEqualsIgnoreCase(String name);
}
