package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.Date;

public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdCustomerOrder;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "Article_id")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "Customer_id")
    private Customer customer;
}
