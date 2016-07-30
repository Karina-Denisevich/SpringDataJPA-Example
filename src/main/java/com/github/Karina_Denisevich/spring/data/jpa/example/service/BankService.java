package com.github.Karina_Denisevich.spring.data.jpa.example.service;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.Bank;

public interface BankService {

    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
}
