package com.example.microservice1.entity;

import jakarta.persistence.ManyToOne;

public class companyOrder {
    @ManyToOne
    private article article;
}
