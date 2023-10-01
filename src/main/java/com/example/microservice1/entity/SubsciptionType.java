package com.example.microservice1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubsciptionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdSubsciptionType;

    private double amount;

    private String duration;

    private String allowedCompanyNumbers;

    private String allowedArticleNumbers;

    @OneToOne(mappedBy = "subscriptionType")
    private Subscription subscription;

}
