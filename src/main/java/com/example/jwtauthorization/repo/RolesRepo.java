package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.users.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RolesRepo extends JpaRepository<Roles,Long> {
    @Query("SELECT COUNT(r) FROM Roles r WHERE r.name=:rolename")
    Long countByName(@Param("rolename") String name);
}
