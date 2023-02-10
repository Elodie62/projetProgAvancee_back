package com.example.sextoysback.ws;

import com.example.sextoysback.pojo.Catalogue;
import com.example.sextoysback.pojo.Product;
import com.example.sextoysback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = ApiRegistration.API_PRODUCT)
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PutMapping ("/updateProduct/{id}")
    public Product updateProductById(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @PostMapping ("/createProduct")
    public void createNewProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @DeleteMapping ("/deleteProduct/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}