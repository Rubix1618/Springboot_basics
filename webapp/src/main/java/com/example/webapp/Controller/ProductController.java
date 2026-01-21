package com.example.webapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.Model.Products;
import com.example.webapp.Service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }
    
    @GetMapping("/products/{id}")
    public Products getproductbyId(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products p){
        service.addProduct(p);
    }
    
    @PutMapping("/products")
    public void updateProduct(@RequestBody Products p){
        service.updateProduct(p);
    }
    
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }
}
