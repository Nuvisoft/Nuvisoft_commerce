package com.nuvissoft.commerce.creditsservice.services;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.nuvissoft.commerce.creditsservice.data.domain.Credit;
import com.nuvissoft.commerce.creditsservice.data.repository.IRCredit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditService implements ICRUD<Credit, UUID> {

    @Autowired
    private IRCredit repository;

    @Override
    public List<Credit> readAll() {
        return repository.findAll();
    }

    @Override
    public Credit readById(UUID id) {
        return repository.getById(id);
    }

    @Override
    public Credit save(Credit entity) {

        return repository.save(entity);
    }

    @Override
    public Credit update(Credit entity) {
        return repository.saveAndFlush(entity);
    }

    public List<Credit> readByDueDate(Date dueDate) {
        return repository.findByDueDate(dueDate);
    }

    public Credit readByDni(String dni) {
        return repository.findByDni(dni);
    }
}
