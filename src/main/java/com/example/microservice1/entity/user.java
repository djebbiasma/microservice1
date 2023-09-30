package com.example.microservice1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idUser;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<company> companies;

}
