package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AlienDTO;
import com.example.demo.model.Alien;

public interface AlienService {

	AlienDTO getAlien(int id);

	List<AlienDTO> getAliens();

	AlienDTO saveAlien(Alien alien);

	String updateAlien(int id,Alien alien);

	String deleteAlien(int id);

}
