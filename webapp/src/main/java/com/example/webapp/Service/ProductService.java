package com.example.webapp.Service;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webapp.Model.Products;
import com.example.webapp.Repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

   

    public List<Products> getProducts() {
        return repo.findAll();
    }

    public Products getProductById(int id){
       
       return repo.findById(id).orElse(null);

        
    }
    public void addProduct(Products p){
        repo.save(p);
    }

    public void updateProduct(Products p){
        repo.save(p);
    }
    public void deleteProduct(int id){
       repo.deleteById(id);
    }
}  
