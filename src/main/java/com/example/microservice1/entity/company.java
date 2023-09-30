package com.example.microservice1.entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;

public class company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String companyId;
    private String name;
    private Date creationDate;
    private Boolean isEnabled;
    @OneToMany(mappedBy = "company")
    private List<article> articles;
    @OneToMany(mappedBy = "company")
    private List<subscription> subscriptions;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
