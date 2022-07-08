package com.nuvissoft.commerce.creditsservice.data.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Credit {

    @Id
    private String _id;

    private double amount;
    private Date dueDate;
    private String dni;

}
