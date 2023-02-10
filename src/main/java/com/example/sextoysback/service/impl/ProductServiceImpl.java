package com.example.sextoysback.service.impl;

import com.example.sextoysback.pojo.Product;
import com.example.sextoysback.repository.ProductRepository;
import com.example.sextoysback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return productRepository.findById(id).map(
                p -> {
                    p.setCatalogue_id(product.getCatalogue_id());
                    p.setName(product.getName());
                    p.setImage(product.getImage());
                    p.setRelease_date(product.getRelease_date());
                    p.setWidth(product.getWidth());
                    p.setLength(product.getLength());
                    p.setThickness(product.getThickness());
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());
                    p.setBrand(product.getBrand());
                    return productRepository.save(p);
                }
        ).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
