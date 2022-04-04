package com.product_management.service;

import com.product_management.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProduct();

    void create(Product product);

    Product findProductById(int id);

    void update(Product product);

    void removeProduct(Product product);

    Product searchProductByName(String search);
}
