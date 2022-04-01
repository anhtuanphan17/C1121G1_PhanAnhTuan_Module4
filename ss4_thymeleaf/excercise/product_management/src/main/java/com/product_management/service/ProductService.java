package com.product_management.service;

import com.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService implements IProductService {

    public static Map<Integer,Product> productList = new HashMap<>();
    public static List<String> manufactureList = new ArrayList<>();

    static {
        productList.put(1,new Product(1, "Iphone 6", 420.0,"Apple"));
        productList.put(2,new Product(2, "Iphone 7", 520.0,"Samsung"));
        productList.put(3,new Product(3, "Iphone 8", 620.0,"Apple"));
        productList.put(4,new Product(4, "Iphone 9", 720.0,"Samsung"));
        productList.put(5,new Product(5, "Iphone 10", 820.0,"Apple"));
        manufactureList.add("Apple");
        manufactureList.add("Samsung");
        manufactureList.add("Huwei");

    }


    @Override
    public List<Product> getAllProduct() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void create(Product product) {
         productList.put(product.getId(),product);
    }

    @Override
    public Product findProductById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public void removeProduct(Product product) {
        productList.remove(product.getId());
    }

    @Override
    public Product searchProductByName(String search) {
        List<Product> products = new ArrayList<>(productList.values());
        for (Product product:products){
            if(product.getName().equals(search)){
                return product;
            }
        }
        return null;
    }
}
