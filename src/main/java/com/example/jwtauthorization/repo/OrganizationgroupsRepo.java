package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.OrganizationGroups;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrganizationgroupsRepo extends JpaRepository<OrganizationGroups,Long> {
    @Query("SELECT COUNT(og) FROM OrganizationGroups og WHERE og.groupid=:groupid AND og.organizationtypeid=:organizationtypeid")
    Long countbyMapping(@Param("groupid") Long groupid, @Param("organizationtypeid") Long organizationtypeid);

    Page<OrganizationGroups> findAllByOrganizationtypeid(Pageable pageable, Long organizationtypeid);
}
