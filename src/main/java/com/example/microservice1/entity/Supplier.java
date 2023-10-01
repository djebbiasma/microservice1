package com.example.microservice1.entity;

import jakarta.persistence.*;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdSupplier;
    private String name;
    @Column(unique = true)
    private String Email;
    @ManyToOne
    @JoinColumn(name = "companyOrder_id") // Nom de la colonne dans la table Subscription faisant référence à Company
    private CompanyOrder companyOrder;
}
