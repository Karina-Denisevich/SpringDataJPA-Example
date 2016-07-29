package com.github.Karina_Denisevich.spring.data.jpa.example.repository;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
