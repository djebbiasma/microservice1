package com.example.microservice1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class subsciptionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idsubsciptionType;

    private double amount;
    private String duration;
    private String allowed_company_numbers;
    private String allowed_article_numbers;
    @OneToOne(mappedBy = "subscriptionType")
    private subscription subscription;

}
