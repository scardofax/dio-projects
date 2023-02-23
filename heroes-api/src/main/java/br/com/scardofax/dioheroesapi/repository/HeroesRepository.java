package br.com.scardofax.dioheroesapi.repository;

import br.com.scardofax.dioheroesapi.model.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
