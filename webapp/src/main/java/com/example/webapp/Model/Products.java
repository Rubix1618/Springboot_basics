package com.example.webapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Products {
    
    @Id
    private int id;
    private String name;
    private int price;

    public Products() {
    }
}
