package com.nuvissoft.commerce.productsservice.web;

import java.util.List;

import com.nuvissoft.commerce.productsservice.data.domain.Product;
import com.nuvissoft.commerce.productsservice.data.repository.ProductRepository;
import com.nuvissoft.commerce.productsservice.web.interfaces.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findByBarcode(String barcode) {
        return repository.findByBarcode(barcode);
    }

    @Override
    public List<Product> findByName(String name) {
        return findByName(name);
    }

    @Override
    public Product addNewProduct(Product product) {
        return repository.insert(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product removeProduct(Product product) {
        Product wasDeleted = product;
        repository.delete(product);
        return wasDeleted;
    }

    @Override
    public List<Product> removeAllProducts(List<Product> products) {
        List<Product> wasDeleted = products;
        repository.deleteAll(products);

        return wasDeleted;
    }
    
}
