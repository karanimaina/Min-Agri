package com.example.jwtauthorization.service;

import com.example.jwtauthorization.dto.OrganizationDTO;
import com.example.jwtauthorization.exxceptions.ItemExistsException;
import com.example.jwtauthorization.exxceptions.ItemNotFound;
import com.example.jwtauthorization.model.models.Organization;
import com.example.jwtauthorization.repo.OrganizationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepo organizationRepo;
    public Organization createOrganization(OrganizationDTO organizationDTO, String createdby) {
        //check that organization does not exist
        Organization organization = organizationRepo.findByName(organizationDTO.getName());
        if (organization != null){
            throw new ItemExistsException("the organization already exist");
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

    public Organization editOrganization(OrganizationDTO organizationDTO) {
        Organization organizations = organizationRepo.findByName(organizationDTO.getName());
      if (organizations == null){
          throw  new ItemNotFound("Organisation not found");
      }
        organizations.setName(organizationDTO.getName());
        organizations.setOrganizationType(organizations.getOrganizationType());
        organizations.setLocationId(organizationDTO.getLocationId());
        organizations.setWebsite(organizationDTO.getWebsite());
        organizations.setEmail(organizations.getEmail());
        organizations.setPhoneNumber(organizationDTO.getPhoneNumber());
        organizations.setRegistrationNumber(organizations.getRegistrationNumber());
        organizations.setLicenseNumber(organizations.getLicenseNumber());
        organizations.setContactUserId(organizations.getContactUserId());
        organizations = organizationRepo.save(organizations);
        return  organizations;
    }

}
