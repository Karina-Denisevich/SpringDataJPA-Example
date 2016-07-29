package com.github.Karina_Denisevich.spring.data.jpa.example.repository;

import com.github.Karina_Denisevich.spring.data.jpa.example.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
