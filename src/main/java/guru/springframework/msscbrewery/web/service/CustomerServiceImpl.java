package guru.springframework.msscbrewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID())
				.name("Fernando")
				.build();
	}

}
