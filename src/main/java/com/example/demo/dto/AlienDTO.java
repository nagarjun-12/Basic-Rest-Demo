package com.example.demo.dto;

import com.example.demo.model.Alien;

public class AlienDTO {
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AlienDTO [id=" + id + ", name=" + name + "]";
	}

	public static AlienDTO convertAlienToDTO(Alien alien) {
		AlienDTO dto = new AlienDTO();
		dto.setId(alien.getId());
		dto.setName(alien.getName());
		return dto;
	}
	
	

}
