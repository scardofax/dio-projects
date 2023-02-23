package br.com.scardofax.diocitiesapi.resource;

import br.com.scardofax.diocitiesapi.model.Country;
import br.com.scardofax.diocitiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public List<Country> getCountry() {
        return countryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Integer id){

        Optional<Country> optional = countryRepository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        }else
            return ResponseEntity.notFound().build();
    }

}
