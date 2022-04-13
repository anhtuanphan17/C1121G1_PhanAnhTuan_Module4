package com.add_product_to_card.service;

import com.add_product_to_card.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
