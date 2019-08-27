package com.euclides.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euclides.cursomc.domain.Cliente;
import com.euclides.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.euclides.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! "+ id + ", Tipo: " + Cliente.class.getName()));
				
	
	}

}
