package br.com.scardofax.diocitiesapi.resource;

import br.com.scardofax.diocitiesapi.model.State;
import br.com.scardofax.diocitiesapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> getState(){
        return stateRepository.findAll();
    }

}
