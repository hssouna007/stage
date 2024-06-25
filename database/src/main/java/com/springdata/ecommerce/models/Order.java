package com.springdata.ecommerce.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    @Column(precision = 10, scale = 2)
    private BigDecimal totalAmount; // Total cost of the order

    @Column(columnDefinition = "TEXT")
    private String shippingAddress;

    @Column(columnDefinition = "TEXT")
    private String billingAddress;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime createdAt; // Timestamp when the order was created

    public void setUser(User user) {
    }

    public void setItems(List<Order> items) {
    }

    // Constructors, getters, and setters
}
