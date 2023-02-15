package com.example.jwtauthorization.service;

import com.example.jwtauthorization.model.location.District;
import com.example.jwtauthorization.model.location.Province;
import com.example.jwtauthorization.repo.DistrictRepo;
import com.example.jwtauthorization.repo.ProvinceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.Specification.where;

@RequiredArgsConstructor
@Service
public class LocationService {
    private final DistrictRepo districtRepo;
    private  final ProvinceRepo provinceRepo;

//    TODO implement  a pageable that retrieves the number districts with the farmers
    public List<District> getDistrict(){
        return districtRepo.findAll();
    }


    public List<Province> getProvince(){
        return provinceRepo.findAll();
    }

}
