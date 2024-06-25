package com.springdata.ecommerce.service.impl;

import com.springdata.ecommerce.models.Product;
import com.springdata.ecommerce.repository.ProductRepository;
import com.springdata.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Implement other CRUD operations as needed
}
