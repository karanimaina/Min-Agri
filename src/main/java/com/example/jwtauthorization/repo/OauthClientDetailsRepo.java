package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.users.OauthclientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OauthClientDetailsRepo extends JpaRepository<OauthclientDetails,String> {
    int countByResourceIds(String resourceId);
}