package com.example.microservice1.entity;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String name;
    private Date creationDate;
    private Boolean isEnabled;
    @OneToMany(mappedBy = "company")
    private List<Article> articles;
    @OneToMany(mappedBy = "company")
    private List<Subscription> subscriptions;
    @ManyToOne

    private User user;
}
