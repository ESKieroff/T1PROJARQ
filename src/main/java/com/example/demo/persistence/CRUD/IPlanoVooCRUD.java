package com.example.demo.persistence.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entities.PlanoDeVoo;

public interface IPlanoVooCRUD extends JpaRepository<PlanoDeVoo, Integer> {
    
}
