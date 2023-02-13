package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.users.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GroupsRepo extends JpaRepository<Groups, Long> {
    @Query("SELECT COUNT(g) FROM Groups g WHERE g.name=:groupname")
    Long countByName(@Param("groupname") String name);

    @Query("SELECT g FROM Groups g WHERE g.name=:groupname")
    Optional<Groups> findByName(@Param("groupname") String name);

    @Query("SELECT r.name FROM Groups g JOIN GroupRoles gr ON g.id=gr.groupid JOIN Roles r ON r.roleid=gr.roleid WHERE g.id=:groupid")
    List<String> findRolesbyGroup(@Param("groupid") Long groupid);
}
