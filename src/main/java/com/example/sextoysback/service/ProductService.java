package com.example.sextoysback.service;

import com.example.sextoysback.pojo.Product;

public interface ProductService {

    String getAllProduct();

    Product getProductById(Long id);

    boolean createProduct();

    Product updateProduct(Long id);

    boolean deleteProduct(Long id);

}