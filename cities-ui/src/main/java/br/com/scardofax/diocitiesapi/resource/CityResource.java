package br.com.scardofax.diocitiesapi.resource;

import br.com.scardofax.diocitiesapi.model.City;
import br.com.scardofax.diocitiesapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<City> getCity(@RequestParam(name = "city", required = false) String nameCity){
        if(nameCity == null)
            return cityRepository.findAll();
        else
            return cityRepository.findByNome(nameCity);

    }




}
