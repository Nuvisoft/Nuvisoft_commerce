package com.nuvissoft.commerce.productsservice.data.domain;

import java.util.List;
import lombok.Data;

@Data
public class Category {

    // private UUID _id ;
    private String name;
    private String description;
    private List<Product> products;
    
}
