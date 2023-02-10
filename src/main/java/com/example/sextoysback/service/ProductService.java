package com.example.sextoysback.service;

import com.example.sextoysback.pojo.Catalogue;
import com.example.sextoysback.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();

    Product getProductById(Long id);

    void createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

}