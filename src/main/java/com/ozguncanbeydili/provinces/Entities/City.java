package com.ozguncanbeydili.provinces.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "plate")
	private int plate;
	
	@Column(name = "name")
	private String name;

	public City() {};
	
	public int getPlate() {
		return plate;
	}

	public void setPlate(int plate) {
		this.plate = plate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
}
