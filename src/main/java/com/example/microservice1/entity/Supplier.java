package com.example.microservice1.entity;

import jakarta.persistence.*;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdSupplier;
    private String name;
    @Column(unique = true)
    private String Email;
    @ManyToOne

    private CompanyOrder companyOrder;
}
