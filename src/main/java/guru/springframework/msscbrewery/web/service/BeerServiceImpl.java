package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Galaxy cat").beerStyle("Pale ale").build();
	}

	@Override
	public BeerDTO save(BeerDTO beerDto) {
		return BeerDTO.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void update(UUID beerId, BeerDTO beerDto) {
		//todo  implementar un update
	}

	@Override
	public void deleteById(UUID beerId) {
		
		log.debug("Deleting beer...");
		// TODO Auto-generated method stub
		
	}
	
	

}
