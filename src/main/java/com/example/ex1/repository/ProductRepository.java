package com.example.ex1.repository;

import com.example.ex1.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryAndPriceLessThanEqualAndStockQuantityGreaterThan(
            String category,
            Double maxPrice,
            Integer stockQuantity
    );
}