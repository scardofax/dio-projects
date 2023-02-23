package br.com.scardofax.diocitiesapi.repository;


import br.com.scardofax.diocitiesapi.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
