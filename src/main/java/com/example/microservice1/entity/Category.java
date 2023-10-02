package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCategory;
    private String name;
    @OneToMany(mappedBy = "Category")

    private List<Article> articles;
}
