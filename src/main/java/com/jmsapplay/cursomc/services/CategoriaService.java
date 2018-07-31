package com.jmsapplay.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmsapplay.cursomc.domain.Categoria;
import com.jmsapplay.cursomc.repositories.CategoriaRepository;
import com.jmsapplay.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não econtrado id: "+ id+ ", Tipo: " +Categoria.class.getName()));
		
	}
}
