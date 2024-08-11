package com.example.Country.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Country.entity.Country;
import com.example.Country.service.CountryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {
	
	private final CountryService countryService;
	
	@PostMapping
    public Country createCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }
	

	 @GetMapping
	    public List<Country> getAllCountries() {
	        return countryService.getAllCountries();
	    }

}
