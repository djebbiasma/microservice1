package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class CompanyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCompanyOrder;
    private Date date;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @OneToMany(mappedBy = "CompanyOrder")
    private List<Supplier> suppliers;
}
