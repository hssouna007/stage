package com.springdata.ecommerce.service;

import com.springdata.ecommerce.models.Product;

public interface ProductService {
    Product saveProduct(Product product);
    // Declare other CRUD operations as needed
}