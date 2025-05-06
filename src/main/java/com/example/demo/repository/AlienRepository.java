package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alien;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer>{

}
