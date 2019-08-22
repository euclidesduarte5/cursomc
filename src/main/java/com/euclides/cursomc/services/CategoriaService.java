package com.euclides.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.euclides.cursomc.domain.Categoria;
import com.euclides.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.euclides.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! "+ id + ", Tipo: " + Categoria.class.getName()));
				
	
	}

}
