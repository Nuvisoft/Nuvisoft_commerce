package com.nuvisoft.commerce.order.data.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class Order {

    @Id
    private String _id;
    private Date date;
    private double amount;
    private List<OrderDetail> details;
}
