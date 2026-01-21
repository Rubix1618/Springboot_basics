package com.example.webapp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webapp.Model.Products;
import com.example.webapp.Repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Products> list = new ArrayList<>(Arrays.asList(
            new Products(101, "Laptop", 45000),new Products(102,"Smartphone",25000)
    ));

    public List<Products> getProducts() {
        return list;
    }

    public Products getProductById(int id){
       for(Products p:list){
        if(p.getId()==id){
            return p;
        }
       }
       return new Products(100,"Not Found",0);
        
    }
    public void addProduct(Products p){
        list.add(p);
    }

    public void updateProduct(Products p){
        int index=0;
        for(int i=0;i<list.size();i++){
            Products prod=list.get(i);
            if(prod.getId()==p.getId()){
                index=i;
                break;
            }
        }
        list.set(index,p);
    }
    public void deleteProduct(int id){
        int index=0;
        for(int i=0;i<list.size();i++){
            Products prod=list.get(i);
            if(prod.getId()==id){
                index=i;
                break;
            }

        }
        list.remove(index);
    }
}  
