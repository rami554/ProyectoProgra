package com.arte.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Persona;
import com.arte.entity.Persona;
import com.arte.repository.PersonaRepository;


@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public ArrayList<Persona> BuscarTodos () {
		return (ArrayList<Persona>) personaRepository.findAll();
	}
	
	public Optional<Persona> BuscarUno (int idPersona) {
		return personaRepository.findById(idPersona);
	}
	
	public Persona Guardar (Persona Persona) {
		return personaRepository.save(Persona);
	}
	
	public void EliminarUno (int idPersona) {
		try {
		personaRepository.deleteById(idPersona);}
		catch(Exception e) {
			System.out.println("No se puede borrar a la persona porque esta registrado en ventas");
		}
	}
	
	public Persona ActualizarUno (int idPersona, Persona PersonaActualizar) {
		Persona PersonaRetorna = new Persona();
		Optional<Persona> p = personaRepository.findById(idPersona);
		if (p.isPresent()) {
			PersonaRetorna = p.get();
			PersonaRetorna = PersonaActualizar;
			personaRepository.save(PersonaRetorna);
		}
		return PersonaRetorna;
	}
}
