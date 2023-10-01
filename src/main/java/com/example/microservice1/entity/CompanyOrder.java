package com.example.microservice1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdCompanyOrder;

    @ManyToOne
    private Article article;
}
