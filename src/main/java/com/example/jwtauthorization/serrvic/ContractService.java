package com.example.jwtauthorization.serrvic;

import com.example.jwtauthorization.dto.ContractMonitoringDto;
import com.example.jwtauthorization.exxceptions.ItemExistsException;
import com.example.jwtauthorization.model.products.ContractMonitoring;
import com.example.jwtauthorization.repo.ContractMonitoringRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService  {
    private final ContractMonitoringRepo contractMonitoringRepo;
     public ContractMonitoring createContactMonitoring(ContractMonitoringDto contractMonitoringDto){
         Long count = contractMonitoringRepo.countByNameAndProductId(contractMonitoringDto.getName(),contractMonitoringDto.getProductId());
         if (count > 0) {
             throw  new ItemExistsException("contract already exists");
         }
         ContractMonitoring contractMonitoring = new ContractMonitoring();
         contractMonitoring.setContractType(contractMonitoringDto.getType());
         contractMonitoring.setEndDate(contractMonitoringDto.getEndDate());
         contractMonitoring.setName(contractMonitoringDto.getName());
         contractMonitoring.setProductId(contractMonitoringDto.getProductId());
         contractMonitoring.setStartDate(contractMonitoringDto.getStartDate());
         contractMonitoringRepo.save(contractMonitoring);
         return contractMonitoring;
     }





     }


