package com.example.Country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Country.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
