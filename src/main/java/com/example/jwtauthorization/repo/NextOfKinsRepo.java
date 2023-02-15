package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.models.NextOfKins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NextOfKinsRepo extends JpaRepository<NextOfKins,Long> {
    NextOfKins findByNationalIdNumberAndUserId(String nationalNumber,Long userId);
}
