package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<AppUser, Long> {
    List<AppUser> findByEmailOrPhonenumberAndActiveIsTrue(String email, String phonenumber);
    List<AppUser> findByEmailOrPhonenumber(String email, String phonenumber);
    List<AppUser> findByEmailOrPhonenumberOrNationalidnumber(String email, String phonenumber, String nationalidnumber);
    List<AppUser> findByNationalidnumber(String nationalidnumber);

    int countByActiveTrue();
    int countByActiveFalse();

}
