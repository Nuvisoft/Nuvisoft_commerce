package com.nuvissoft.commerce.productsservice.web.interfaces;

import java.util.List;

import com.nuvissoft.commerce.productsservice.data.domain.Product;

public interface IProductService {

    public List<Product> findAll();

    public Product findByBarcode(String barcode);

    public List<Product> findByName(String name);

    public Product addNewProduct(Product product);

    public Product updateProduct(Product product);

    public Product removeProduct(Product product);

    public List<Product> removeAllProducts(List<Product> products);
}
