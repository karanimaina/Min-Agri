package com.example.jwtauthorization.service;


import com.example.jwtauthorization.model.users.AppUser;
import com.example.jwtauthorization.model.users.UserRoles;
import com.example.jwtauthorization.repo.UserRolesRepo;
import com.example.jwtauthorization.repo.UsersRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepo dbusersRepo;

    private final UserRolesRepo userRolesRepo;

    @Transactional
    public Optional<AppUser> loadUserByusername(String username) {

        List<AppUser> dbusersList = dbusersRepo.findByEmailOrPhonenumberOrNationalidnumber(username, username, username);
        if (dbusersList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(dbusersList.get(0));
        }
    }

    public Optional<AppUser> loadbyUserid(Long userid){
        return dbusersRepo.findById(userid);
    }

    public List<String> getRolesbyUser(Long userid){
        return userRolesRepo.getRolesbyUser(userid);
    }

    public Long getUseridfromOptional(String username){
        return loadUserByusername(username).get().getUserid();
    }
}
