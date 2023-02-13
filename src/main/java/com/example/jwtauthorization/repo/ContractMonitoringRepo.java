package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.ContractMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractMonitoringRepo  extends JpaRepository<ContractMonitoring,Long>{
    Long countByNameAndProductId(String name, long productId);
}
