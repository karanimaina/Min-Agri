package com.example.jwtauthorization.service;

import com.example.jwtauthorization.repo.DistrictRepo;
import com.example.jwtauthorization.repo.ProvinceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.jpa.domain.Specification.where;

@RequiredArgsConstructor
@Service
public class LocationService {
    private final DistrictRepo districtRepo;
    private  final ProvinceRepo provinceRepo;

    public Page<District> getDistrict(Pageable pageable, Optional<Long> provinceid,
                                      Optional<String> districtname){
        return districtRepo.findAll(where(provinceIdEquals(provinceid))
                        .and(districtNameLike(districtname)),
                pageable);
    }

    public Page<Province> getProvinces(Pageable pageable, Optional<String> provincename){
        return provinceRepo.findAll(where(proviceNameLike(provincename)),
                pageable);
    }

}
