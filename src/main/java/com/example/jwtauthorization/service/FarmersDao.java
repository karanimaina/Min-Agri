package com.example.jwtauthorization.service;


import com.example.jwtauthorization.dto.FarmerDTO;
import com.example.jwtauthorization.dto.FarmerDetailsDTO;
import com.example.jwtauthorization.dto.NextofKinDTO;
import com.example.jwtauthorization.exxceptions.ItemExistsException;
import com.example.jwtauthorization.exxceptions.ItemNotFound;
import com.example.jwtauthorization.model.models.FarmerDetails;
import com.example.jwtauthorization.model.models.NextOfKins;
import com.example.jwtauthorization.model.users.AppUser;
import com.example.jwtauthorization.repo.FarmerDetailsRepo;
import com.example.jwtauthorization.repo.NextOfKinsRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FarmersDao {// extends UsersCommonDao {
    private final FarmerDetailsRepo farmerDetailsRepo;
    private final NextOfKinsRepo nextOfKinsRepo;

    public FarmerDetails AddFarmerdetails(FarmerDetailsDTO farmerDetailsDTO) {
        FarmerDetails farmerDetails1 = farmerDetailsRepo.findById(farmerDetailsDTO.getUserId()).orElse(null);
        if (farmerDetails1 != null) {
            throw new ItemExistsException("farmer already exist ");
        }
        FarmerDetails farmerDetails = new FarmerDetails();
        //edit farmerDetails
        farmerDetails.setLocationId(farmerDetailsDTO.getLocationId());
        farmerDetails.setMaritalStatus(farmerDetailsDTO.getMaritalStatus());
        farmerDetails.setPhoto(farmerDetailsDTO.getPhoto());
        farmerDetails.setFieldAgentId(farmerDetailsDTO.getFieldAgentId());
        farmerDetails.setNidaVerification(farmerDetailsDTO.getNeedVerification());
        farmerDetails.setRlmaVerification(farmerDetailsDTO.getRlmaVerification());
        farmerDetails.setBankName(farmerDetailsDTO.getBankName());
        farmerDetails.setBranch(farmerDetailsDTO.getBranch());
        farmerDetails.setAccountName(farmerDetailsDTO.getAccountName());
        farmerDetails.setAccountNumber(farmerDetails.getAccountNumber());
        farmerDetailsRepo.save(farmerDetails);
        return farmerDetails;
    }

    public NextOfKins addNextofKin(NextofKinDTO nextofKinDTO, String createdby) {
//        Optional<AppUser> usersOptional = loadbyUserid(nextofKinDTO.getUserid());
//        if (usersOptional.isEmpty()) {
//            return new ResponseWrapper("failed", "farmer has to register as user");
//        }
        //check that next of kin hasn't been added
        NextOfKins nextOfKin1 = nextOfKinsRepo.findByNationalIdNumberAndUserId(nextofKinDTO.getNationalIdNumber(), nextofKinDTO.getUserId());
        if (nextOfKin1 != null) {
            throw new ItemExistsException("failed, next of kin already registered to farmer");
        }
        //add next of kin
        NextOfKins nextOfKin = new NextOfKins();
        nextOfKin.setUserId(nextofKinDTO.getUserId());
        nextOfKin.setLocationId(nextOfKin.getLocationId());
        nextOfKin.setRelationship(nextOfKin.getRelationship());
        nextOfKin.setPhoneNumber(nextofKinDTO.getPhoneNumber());
        nextOfKin.setEmail(nextofKinDTO.getEmail());
        nextOfKin.setNationalIdNumber(nextofKinDTO.getNationalIdNumber());
        nextOfKinsRepo.save(nextOfKin);
        return nextOfKin;
    }


    public Page<FarmerDetails> getFarmersList(Pageable pageable) {
        Page<FarmerDetails> farmerDetails = farmerDetailsRepo.findAll(pageable);
        return farmerDetails;
    }
    public Page<NextOfKins> getNextofKin(Pageable pageable) {

        return nextOfKinsRepo.findAll(pageable);
    }
}

