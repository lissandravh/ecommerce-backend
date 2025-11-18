package com.ecommerce_monorepo.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocal;

    private Long externalId;
    private String title;
    private Double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String category;
    private String image;

    private Double rate;
    private Integer count;
}
