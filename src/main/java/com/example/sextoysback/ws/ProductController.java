package com.example.sextoysback.ws;

import com.example.sextoysback.pojo.Product;
import com.example.sextoysback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiRegistration.API_PRODUCT)
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/hello1")
    public String getHello(){
        return productService.getAllProduct();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PutMapping ("/updateProduct/{id}")
    public Product updateProductById(@PathVariable Long id){
        return productService.updateProduct(id);
    }

    @PostMapping ("/createProduct")
    public boolean createNewProduct(){
        return productService.createProduct();
    }

    @DeleteMapping ("/deleteProduct/{id}")
    public boolean deleteProductById(@PathVariable Long id){
        return productService.deleteProduct(id);
    }

}