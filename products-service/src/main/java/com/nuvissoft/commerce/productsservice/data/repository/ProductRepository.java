package com.nuvissoft.commerce.productsservice.data.repository;

import java.util.List;
import com.nuvissoft.commerce.productsservice.data.domain.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{

    public Product findByBarcode(String barcode);

    public List<Product> findByName(String name);

}
