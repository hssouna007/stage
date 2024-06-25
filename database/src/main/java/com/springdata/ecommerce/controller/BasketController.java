package com.example.demo.controller;


import com.springdata.ecommerce.models.Basket;
import com.springdata.ecommerce.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    // Create a new basket
    @PostMapping
    public ResponseEntity<Basket> createBasket(@RequestBody Basket basket) {
        Basket savedBasket = basketService.createBasket(basket);
        return new ResponseEntity<>(savedBasket, HttpStatus.CREATED);
    }

    // Get all baskets
    @GetMapping
    public ResponseEntity<List<Basket>> getAllBaskets() {
        List<Basket> baskets = basketService.getAllBaskets();
        return new ResponseEntity<>(baskets, HttpStatus.OK);
    }

    // Get a basket by ID
    @GetMapping("/{id}")
    public ResponseEntity<Basket> getBasketById(@PathVariable Long id) {
        Basket basket = basketService.getBasketById(id);
        return new ResponseEntity<>(basket, HttpStatus.OK);
    }

    // Update a basket
    @PutMapping("/{id}")
    public ResponseEntity<Basket> updateBasket(@PathVariable Long id, @RequestBody Basket basketDetails) {
        Basket updatedBasket = basketService.updateBasket(id, basketDetails);
        return new ResponseEntity<>(updatedBasket, HttpStatus.OK);
    }

    // Delete a basket
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBasket(@PathVariable Long id) {
        basketService.deleteBasket(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
