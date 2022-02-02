package com.nuvissoft.commerce.productsservice.data.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ProductDetail {

    private Provider provider;
    private double costPrice;
    private double salesPrice;
    private Date dueDate;
    private double stock;

    
}
