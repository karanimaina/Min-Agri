package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.location.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProvinceRepo extends JpaRepository<Province,Long>{
}
