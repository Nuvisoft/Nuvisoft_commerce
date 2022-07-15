package com.nuvisoft.commerce.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvisoft.commerce.order.data.domain.Order;
import com.nuvisoft.commerce.order.data.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired OrderRepository repository;

    public Order save(Order toAddNewOrder) {
        return repository.insert(toAddNewOrder);
    }

    public List<Order> getAll(){
        return repository.findAll();
    }

    public List<Order> findByDate(String date){
        return this.repository.findByDate(date);
    }
}
