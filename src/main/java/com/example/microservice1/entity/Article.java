package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.List;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdArticle;

    private String IdSupplier;
    private String name;
    private String description;
    private int quantity;
    private String categoryId;

    @OneToMany(mappedBy = "article")

    private List<CompanyOrder>Orders;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "article")

    private List<CustomerOrder>CustomerOrders;
}
