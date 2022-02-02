package com.nuvissoft.commerce.creditsservice.data.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.nuvissoft.commerce.creditsservice.data.domain.Credit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRCredit extends JpaRepository<Credit, UUID> {

    public Credit findByAmount(double amount);

    public List<Credit> findByDueDate(Date dueDate);

    public Credit findByDni(String dni);
}
