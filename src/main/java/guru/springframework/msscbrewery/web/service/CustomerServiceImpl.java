package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID()).name("Fernando").build();
	}

	@Override
	public CustomerDTO save(CustomerDTO customerDto) {
		return CustomerDTO.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void update(UUID customerId, CustomerDTO customerDto) {
		// TODO Implementar update ...
		
	}

	@Override
	public void deleteById(UUID customerId) {
		log.debug("Deleting beer...");
		// TODO Auto-generated method stub
	}


}
