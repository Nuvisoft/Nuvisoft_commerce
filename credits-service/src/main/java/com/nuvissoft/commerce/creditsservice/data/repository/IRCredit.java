package com.nuvissoft.commerce.creditsservice.data.repository;

import java.util.Date;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.nuvissoft.commerce.creditsservice.data.domain.Credit;

public interface IRCredit extends MongoRepository<Credit, String> {
    public Credit findByAmount(double amount);

    public List<Credit> findByDueDate(Date dueDate);

    public Credit findByDni(String dni);
}
