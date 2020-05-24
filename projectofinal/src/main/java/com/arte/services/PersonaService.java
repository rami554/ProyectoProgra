package com.arte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Persona;
import com.arte.repository.PersonaRepository;


@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> BuscarTodos(){
		return (List<Persona>) personaRepository.findAll();
	}
}
