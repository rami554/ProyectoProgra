package com.arte.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arte.entity.Persona;
import com.arte.service.PersonaService;

@RestController
@RequestMapping("/Persona")

public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public ArrayList<Persona> ListarTodos () {
		return personaService.BuscarTodos();
	}
	
	@GetMapping("/{idPersona}")
	public Optional<Persona> ListarUno (@PathVariable int idPersona) {
		return personaService.BuscarUno(idPersona);
	}
	
	@PostMapping
	public ResponseEntity<Persona> Guardar (@RequestBody Persona entidadPersona) {
		return new ResponseEntity<Persona>(personaService.Guardar(entidadPersona), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{idPersona}")
	public void EliminarUno (@PathVariable int idPersona) {
		personaService.EliminarUno(idPersona);
	}
	
	@PutMapping("/{idPersona}")
	public Persona ActualizarUno (@RequestBody Persona entidadPersona,
									  @PathVariable int idPersona) {
		return personaService.ActualizarUno(idPersona, entidadPersona);
	}
}
