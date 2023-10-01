package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.List;

public class article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idArticle;

    private String idSupplier;
    private String name;
    private String description;
    private int quantity;
    private String categoryId;

    @OneToMany(mappedBy = "article")

    private List<companyOrder>Orders;

    @ManyToOne
    @JoinColumn(name = "company_id") // Nom de la colonne dans la table Article faisant référence à Company
    private company company;


}
