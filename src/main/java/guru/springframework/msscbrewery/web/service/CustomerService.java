package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

public interface CustomerService {

	CustomerDTO getById(UUID customerId);
	
	CustomerDTO save(CustomerDTO customerDto);
	
	void update(UUID customerId ,CustomerDTO customerDto);
	
	void deleteById(UUID customerId);
	
}
