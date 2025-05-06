package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Alien;

@Controller
public class StudentController {
	
	@GetMapping("/alien/{id}")
	public Alien getAlien(@PathVariable("id") int id) {
		return null;
	}
	
	@GetMapping("/aliens")
	public List<Alien> getAliens(){
		List<Alien> aliens = null;
		return aliens;
	}
	
	@PostMapping("/save")
	public String saveAlien(@RequestBody Alien alien)
	{
		return "Saved Successfully";
	}
	
	@PutMapping("/update")
	public String updateAlien(@RequestBody Alien alien)
	{
		return "updated successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public Alien deleteAlien(@PathVariable("id") int id) {
		Alien alien = null;
		return alien;
	}

}
