package br.com.scardofax.diocitiesapi.repository;

import br.com.scardofax.diocitiesapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
