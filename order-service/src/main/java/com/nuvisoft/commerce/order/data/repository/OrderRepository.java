package com.nuvisoft.commerce.order.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nuvisoft.commerce.order.data.domain.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    public List<Order> findByDate(String Date);
}
