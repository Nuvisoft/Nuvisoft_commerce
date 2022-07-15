package com.nuvisoft.commerce.order.data.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class OrderDetail {

    private String barcode;
    private double quantity;
}
