package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AlienDTO;
import com.example.demo.model.Alien;
import com.example.demo.repository.AlienRepository;

@Service
public class AlienServiceImpl implements AlienService{
	
	@Autowired
	AlienRepository repository;

	@Override
	public AlienDTO getAlien(int id) {
		Alien alien = repository.findById(id).get();
		AlienDTO alienDTO = AlienDTO.convertAlienToDTO(alien);
		return alienDTO;
	}

	@Override
	public List<AlienDTO> getAliens() {
		List<Alien> aliens = repository.findAll();
		List<AlienDTO> alienDTOs = aliens.stream().map(alien->AlienDTO.convertAlienToDTO(alien)).collect(Collectors.toList());
		return alienDTOs;
	}

	@Override
	public AlienDTO saveAlien(Alien alien) {
		Alien response = repository.save(alien);
		return AlienDTO.convertAlienToDTO(response);
		
	}

	@Override
	public String updateAlien(int id,Alien alien) {
		
		Alien response = repository.findById(id).orElseThrow(()-> new RuntimeException("Alien not found"));
		response.setName(alien.getName());
		response.setPoints(alien.getPoints());
		repository.save(response);
		return "Updated Successfully";
	}

	@Override
	public String deleteAlien(int id) {
		repository.deleteById(id);
		return "Deleted successfully";
		
	}
}
