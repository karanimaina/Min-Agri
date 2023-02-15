package com.example.jwtauthorization.service;

import com.example.jwtauthorization.dto.OrganizationDTO;
import com.example.jwtauthorization.exxceptions.ItemNotFound;
import com.example.jwtauthorization.model.models.Organization;
import com.example.jwtauthorization.repo.OrganizationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepo organizationRepo;
    public Organization createOrganization(OrganizationDTO organizationDTO, String createdby) {
        //check that organization does not exist
        Organization organization = organizationRepo.findByName(organizationDTO.getName());
        if (organization != null){
            throw new ItemNotFound("the organization already exist");
        }

        Organization organizations = new Organization();
        organizations.setName(organizations.getName ());
        organizations.setOrganizationType(organizationDTO.getOrganisationType ());
        organizations.setLocationId(organizationDTO. getLocationId());
        organizations.setWebsite(organizationDTO.getWebsite ());
        organizations.setEmail(organizationDTO.getEmail ());
        organizations.setPhoneNumber(organizationDTO.getPhoneNumber());
        organizations.setRegistrationNumber(organizationDTO.getRegistrationNumber());
        organizations.setLicenseNumber(organizationDTO.getLicenseNumber ());
        organizations.setContactUserId(organizationDTO.getContactUserId());
        organizationRepo.save(organizations);
        return organizations;
    }


}
