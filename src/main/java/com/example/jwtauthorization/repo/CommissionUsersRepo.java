package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.CommissionUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommissionUsersRepo extends JpaRepository<CommissionUsers, Long> {
//    @Query("SELECT  COUNT (cu)FROM CommissionUsers  cu WHERE  cu.userId=:userid AND cu.commissionId=:commissionid")
    Long countByUserIdAndCommissionId(long userId,long commissonId);
}
