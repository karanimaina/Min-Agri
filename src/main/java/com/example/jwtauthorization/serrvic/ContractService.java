package com.example.jwtauthorization.serrvic;

import com.example.jwtauthorization.dto.ContractMonitoringDto;
import com.example.jwtauthorization.dto.FileDto;
import com.example.jwtauthorization.exxceptions.ItemExistsException;
import com.example.jwtauthorization.exxceptions.UserException;
import com.example.jwtauthorization.model.products.ContractMonitoring;
import com.example.jwtauthorization.repo.ContractMonitoringRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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

    public List<ContractMonitoring> listContractMonitoring(PageRequest pageRequest){
        Page<ContractMonitoring> contractMonitoringPage =contractMonitoringRepo.findAll(pageRequest);
        return contractMonitoringPage.getContent();
    }
    public String uploadDocuments(FileDto fileDto) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.isAuthenticated()) {
            ContractMonitoring contractMonitoring = contractMonitoringRepo.findById(fileDto.getContractId()).orElse(null);
            //check that product exists
            if (contractMonitoring == null) {
                return "contract by that id not found";
            }
            String filename = fileDto.getMultipartFile().getOriginalFilename();
            String[] nameparts = filename.split(".");
            filename = nameparts[0] + "_" + fileDto.getContractId() + nameparts[1];
            try {

                if (filename.contains(".xlsx")) {
                    filename = saveFile(fileDto.getMultipartFile(), filename);
                } else if (filename.contains(".xls")) {
                    filename = saveFile(fileDto.getMultipartFile(), filename);
                } else {
                    return "unsupported file format, use only xls or xlsx file extensions";
                }
            } catch (IOException ex) {
                //error reading file
                return "data upload failed " + ex.getMessage();
            }
            updateContractMatrixPath(fileDto.getContractId(), filename);
            return "data upload completed with no errors";
        }
        throw new UserException("user is not authenticated to perform this operation");
    }
    private void updateContractMatrixPath(Long contractid, String matrixpath) {
        ContractMonitoring contractMonitoring = contractMonitoringRepo.findById(contractid).get();
        contractMonitoring.setFileLocation(matrixpath);
        contractMonitoringRepo.save(contractMonitoring);
    }
    private String saveFile(MultipartFile matrixfile, String filename) throws IOException {
        String dir = System.getProperty("user.dir")+System.getProperty("file.separator")+"contracts";

        Files.copy(matrixfile.getInputStream(), Paths.get(dir, filename));
        return Paths.get(dir, filename).toAbsolutePath().toString();
    }

     }


