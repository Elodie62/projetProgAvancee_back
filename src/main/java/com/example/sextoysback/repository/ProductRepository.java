package com.example.sextoysback.repository;

import com.example.sextoysback.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

        Product getAllProduct();

}