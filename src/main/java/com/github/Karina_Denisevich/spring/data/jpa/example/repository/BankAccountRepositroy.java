package com.github.Karina_Denisevich.spring.data.jpa.example.repository;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositroy extends JpaRepository<BankAccount, Long> {
}
