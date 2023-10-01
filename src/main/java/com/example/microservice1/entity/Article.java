package com.example.microservice1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdArticle;

    private long idSupplier;

    private String name;

    private String description;

    private int quantity;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "article")
    private List<CustomerOrder> customerOrders;

    @ManyToOne
    private Company company;
}
