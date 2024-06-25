package com.springdata.ecommerce.repository;

import com.springdata.ecommerce.models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {
    // No need for static methods here
    Optional<Basket> findByUserId(UUID userId);
}
