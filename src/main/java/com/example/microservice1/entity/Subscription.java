package com.example.microservice1.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdSubscription;
    private Date creationDate;
    private Date EndDate;

    @ManyToOne
    @JoinColumn(name = "company_id") // Nom de la colonne dans la table Subscription faisant référence à Company
    private Company company;

    @OneToOne
    @JoinColumn(name = "subscription_type_id") // Nom de la colonne dans la table Subscription faisant référence à SubscriptionType
    private SubsciptionType subscriptionType;
}
