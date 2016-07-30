package com.github.Karina_Denisevich.spring.data.jpa.example.service.impl;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.Bank;
import com.github.Karina_Denisevich.spring.data.jpa.example.repository.BankRepository;
import com.github.Karina_Denisevich.spring.data.jpa.example.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank addBank(Bank bank) {

        Bank savedBank = bankRepository.saveAndFlush(bank);

        return savedBank;
    }

    @Override
    public void delete(long id) {

        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {

        return bankRepository.findByName(name);
    }
}
