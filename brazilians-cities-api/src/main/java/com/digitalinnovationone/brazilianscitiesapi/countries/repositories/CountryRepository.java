package com.digitalinnovationone.brazilianscitiesapi.countries.repositories;

import com.digitalinnovationone.brazilianscitiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
