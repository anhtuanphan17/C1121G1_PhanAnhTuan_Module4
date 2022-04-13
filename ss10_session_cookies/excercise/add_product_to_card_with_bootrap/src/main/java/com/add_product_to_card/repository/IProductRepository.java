package com.add_product_to_card.repository;

import com.add_product_to_card.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {

}
