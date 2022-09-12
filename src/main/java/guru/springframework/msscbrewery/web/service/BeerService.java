package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerDTO;

public interface BeerService {
	
	BeerDTO getById(UUID beerId);

	BeerDTO save(BeerDTO beerDto);

	void update(UUID beerId, BeerDTO beerDto);

	void deleteById(UUID beerId);

}
