package com.github.Karina_Denisevich.spring.data.jpa.example.repository;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
