package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.Basket;
import com.springdata.ecommerce.models.Product;
import com.springdata.ecommerce.models.User;

import java.util.List;
import java.util.Optional;

public interface BasketService {
    Basket addItemToBasket(Long userId, Product product, int quantity);

    void deleteBasket(Long id);

    Basket updateBasket(Long id, Basket basketDetails);

    Basket getBasketById(Long id);

    List<Basket> getAllBaskets();

    Basket createBasket(Basket basket);
    // Declare other basket management methods here
}
