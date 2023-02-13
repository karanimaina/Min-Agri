package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.ProductLoading;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductloadingRepo extends JpaRepository<ProductLoading, Long> {
    @Query("SELECT COUNT(pl) FROM ProductLoading pl WHERE pl.name=:name AND pl.rate=:rate AND pl.productid=:productid")
    Long countByNameRateAndProductID(@Param("name") String name, @Param("rate") Double rate, @Param("productid") Long productid);

    Page<ProductLoading> getAllByProductid(Pageable pageable, Long productid);
}
