package com.product_management.service;

import com.product_management.model.Product;
import com.product_management.repository.BaseRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {

    public static Map<Integer, Product> productList = new HashMap<>();
    public static List<String> manufactureList = new ArrayList<>();


    @Override
    public List<Product> getAllProduct() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                "select p from product p", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction =  BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();

    }


    @Override
    public Product findProductById(int id) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
          "select p from product p where p.id =:ProductId",Product.class);
        typedQuery.setParameter("ProductId",id);
        return typedQuery.getSingleResult();

    }

    @Override
    public void update(Product product) {
       EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
       entityTransaction.begin();
       BaseRepository.entityManager.merge(product);
       entityTransaction.commit();
    }

    @Override
    public void removeProduct(Product product) {
       EntityTransaction entityTransaction =BaseRepository.entityManager.getTransaction();
       entityTransaction.begin();
       BaseRepository.entityManager.remove(product);
       entityTransaction.commit();
    }

    @Override
    public Product searchProductByName(String search) {
        String query = "select p from product as p where p.name like ?1";
       TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(query,Product.class);

       typedQuery.setParameter(1,"%"+search+"%");
       return typedQuery.getSingleResult();

    }



//        List<Product> products = getAllProduct();
//        for (Product product : products) {
//            if (product.getName().equals(search)) {
//                return product;
//            }
//        }
//        return null;
//    }

}
