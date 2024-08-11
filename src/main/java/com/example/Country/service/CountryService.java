package com.example.Country.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Country.entity.Country;
import com.example.Country.repository.CountryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class CountryService {
	
	private final CountryRepository countryRepository;

	 public Country saveCountry(Country country) {
	        return countryRepository.save(country);
	    }
	 
	 

	    public List<Country> getAllCountries() {
	        return countryRepository.findAll();
	    }

}
