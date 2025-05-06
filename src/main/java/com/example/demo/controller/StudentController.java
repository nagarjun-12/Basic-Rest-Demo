package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AlienDTO;
import com.example.demo.model.Alien;
import com.example.demo.service.AlienService;

@RestController
public class StudentController {
	
	@Autowired
	AlienService service;
	
	@GetMapping("/alien/{id}")
	public AlienDTO getAlien(@PathVariable("id") int id) {
		AlienDTO alien = service.getAlien(id);
		return alien;
	}
	
	@GetMapping("/aliens")
	public List<AlienDTO> getAliens(){
		List<AlienDTO> aliens = service.getAliens();
		return aliens;
	}
	
	@PostMapping("/save")
	public AlienDTO saveAlien(@RequestBody Alien alien)
	{
		AlienDTO response = service.saveAlien(alien);
		return response;
	}
	
	@PutMapping("/update/{id}")
	public String updateAlien(@PathVariable("id") int id,@RequestBody Alien alien)
	{
		String response = service.updateAlien(id,alien);
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAlien(@PathVariable("id") int id) {
		String response = service.deleteAlien(id);
		return response;
	}

}
