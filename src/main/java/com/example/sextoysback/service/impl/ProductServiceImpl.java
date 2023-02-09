package com.example.sextoysback.service.impl;

import com.example.sextoysback.pojo.Product;
import com.example.sextoysback.repository.ProductRepository;
import com.example.sextoysback.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public ProductRepository productRepository;

    @Override
    public String getAllProduct() {
        return productRepository.findAll().toString();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public boolean createProduct() {
        return false;
    }

    @Override
    public Product updateProduct(Long id) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long id) {
        return false;
    }
}
