package com.example.ex1.repository;

import com.example.ex1.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    /**
     * Giair quet 2 loi
     * 1. PriceLessThanEqual: de lay gia <= maxPrice
     * 2. StockQuantityGreaterThan: dam bao ton kho > 0
     */
    @Query("SELECT p FROM Product p WHERE p.category = ?1 AND p.price <= ?2 AND p.stockQuantity > 0")
    List<Product> findProductsByBusinessRules(String category, Double maxPrice);
}