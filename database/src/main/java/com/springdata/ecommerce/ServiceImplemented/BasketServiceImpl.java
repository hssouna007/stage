package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.Basket;
import com.springdata.ecommerce.models.Product;
import com.springdata.ecommerce.models.User;
import com.springdata.ecommerce.repository.BasketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BasketServiceImpl implements BasketService {

    private final BasketRepository basketRepository;

    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public Basket addItemToBasket(Long userId, Product product, int quantity) {
        // Convert Long userId to UUID
        UUID userUuid = UUID.fromString(String.valueOf(userId));
        Optional<Basket> optionalBasket = basketRepository.findByUserId(userUuid);

        Basket basket = optionalBasket.orElseGet(() -> {
            // Create a new User instance with the UUID
            User newUser = new User(userUuid.toString());
            return basketRepository.save(new Basket(newUser));
        });

        // Assuming Basket has a method to add a product and quantity
        basket.addProduct(product, quantity); // This line is hypothetical and depends on your Basket model

        return basket;
    }

    @Override
    public void deleteBasket(Long id) {

    }

    @Override
    public Basket updateBasket(Long id, Basket basketDetails) {
        return null;
    }

    @Override
    public Basket getBasketById(Long id) {
        return null;
    }

    @Override
    public List<Basket> getAllBaskets() {
        return List.of();
    }

    @Override
    public Basket createBasket(Basket basket) {
        return null;
    }

    // Implement other basket management methods here
}
