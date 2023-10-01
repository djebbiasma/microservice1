package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.List;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdCustomer;
    private String name;
    private String Country;
    private String PhoneNumber;
    private String Activity;
    @Column(unique = true)
    private String Email;
    @OneToMany(mappedBy = "Customer")
    private List<CustomerOrder> CustomerOrders;
    @ManyToOne
    @JoinColumn(name = "Activity_id")
    private Activity activities;
}
