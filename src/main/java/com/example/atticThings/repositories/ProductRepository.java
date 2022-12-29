package com.example.atticThings.repositories;

import com.example.atticThings.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitleAndCity(String title,String city);
    List<Product> findByCity(String city);
    List<Product> findByTitle(String title);
}
