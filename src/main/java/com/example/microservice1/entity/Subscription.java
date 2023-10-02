package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdSubscription;
    private Date creationDate;
    private Date EndDate;

    @ManyToOne

    private Company company;

    @OneToOne

    private SubsciptionType subscriptionType;
}
