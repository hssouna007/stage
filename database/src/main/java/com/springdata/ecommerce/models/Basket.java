package com.springdata.ecommerce.models;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BasketItem> items;

    @Column(precision = 10, scale = 2)
    private BigDecimal totalAmount;

    public Basket(User user) {
    }

    public Basket(Basket basket, Product product, int quantity) {
    }

    public void addProduct(Product product, int quantity) {

    }


}