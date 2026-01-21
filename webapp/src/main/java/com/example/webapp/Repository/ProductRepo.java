package com.example.webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webapp.Model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer>{
    
}
