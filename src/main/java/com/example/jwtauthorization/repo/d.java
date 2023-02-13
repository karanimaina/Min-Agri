package com.example.jwtauthorization.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OauthClientDetailsRepo extends JpaRepository<OauthclientDetails,String> {
    int countByResourceIds(String resourceid);
}