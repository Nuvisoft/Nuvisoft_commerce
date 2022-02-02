package com.nuvissoft.commerce.productsservice.data.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Product {

    @Id
    private String _id;
    @Indexed(unique = true)
    private String barcode;

    private String name;
    private String measurement;
    private ProductDetail detail;

}
