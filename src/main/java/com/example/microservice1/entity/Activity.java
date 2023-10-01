package com.example.microservice1.entity;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Activity {
    @OneToMany(mappedBy = "Activity")
    private List<Customer> Customers;
}
