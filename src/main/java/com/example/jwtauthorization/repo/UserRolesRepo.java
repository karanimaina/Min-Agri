package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.users.Groups;
import com.example.jwtauthorization.model.users.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRolesRepo extends JpaRepository<UserRoles,Long> {
    @Query(nativeQuery = true,value =
            "SELECT * FROM miniagri_usersroles ur WHERE ur.userid=:userid AND ur.roleid=:roleid")
    Optional<UserRoles> findbyUserRole(@Param("userid") long userid, @Param("roleid") long roleid);

    @Query(nativeQuery = true,value =
            "SELECT COUNT(*) FROM miniagri_usersroles ur WHERE ur.userid=:userid AND ur.groupid=:groupid")
    Long countbyUserRole(@Param("userid") long userid,@Param("groupid") long groupid);
    @Query(nativeQuery = true,
            value = "SELECT name FROM miniagri_usersroles ur JOIN miniagri_grouproles mgr ON ur.groupid=mgr.groupid " +
                    "JOIN miniagri_rolesconfig mrc ON mgr.roleid=mrc.roleid WHERE ur.userid=:userid")
    List<String> getRolesbyUser(@Param("userid") Long userid);

    @Query("SELECT g FROM UserRoles ur JOIN Groups g ON ur.groupid=g.id WHERE ur.userid=:userid")
    List<Groups> findUsergroupsByUserid(@Param("userid") Long userid);
}
