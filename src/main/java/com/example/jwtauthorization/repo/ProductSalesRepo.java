package com.example.jwtauthorization.repo;

import com.example.jwtauthorization.model.products.ProductSales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSalesRepo extends JpaRepository<ProductSales,Long> {
}
