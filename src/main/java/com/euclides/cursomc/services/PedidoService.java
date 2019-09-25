package com.euclides.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euclides.cursomc.domain.Pedido;
import com.euclides.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.euclides.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! "+ id + ", Tipo: " + Pedido.class.getName()));
				
	
	}

}
