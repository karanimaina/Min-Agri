package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.Organization;
import com.example.jwtauthorization.model.models.Organizations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrganizationRepo extends JpaRepository<Organization,Long> {
    Organization findByName(String name);

}
