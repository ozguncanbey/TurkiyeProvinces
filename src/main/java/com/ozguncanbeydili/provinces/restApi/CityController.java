package com.ozguncanbeydili.provinces.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozguncanbeydili.provinces.Business.ICityService;
import com.ozguncanbeydili.provinces.Entities.City;

@RestController
@RequestMapping("/cities")
public class CityController {

	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping
	public List<City> get() {
		return cityService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/{id}")
	public City getById(@PathVariable int id) {
		return cityService.getById(id);
	}
}
