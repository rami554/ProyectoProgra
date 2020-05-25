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

import com.arte.entity.Obraexpo;
import com.arte.service.ObraExpoService;

@RestController
@RequestMapping("/ObraExpo")

public class ObraExpoController {

	@Autowired
	private ObraExpoService obraExpoService;
	
	@GetMapping
	public ArrayList<Obraexpo> ListarTodos () {
		return obraExpoService.BuscarTodos();
	}
	
	@GetMapping("/{id_obraexpo}")
	public Optional<Obraexpo> ListarUno (@PathVariable int id_obraexpo) {
		return obraExpoService.BuscarUno(id_obraexpo);
	}
	
	@PostMapping
	public ResponseEntity<Obraexpo> Guardar (@RequestBody Obraexpo entidadObraexpo) {
		return new ResponseEntity<Obraexpo>(obraExpoService.Guardar(entidadObraexpo), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id_obraexpo}")
	public void EliminarUno (@PathVariable int id_obraexpo) {
		obraExpoService.EliminarUno(id_obraexpo);
	}
	
	@PutMapping("/{id_obraexpo}")
	public Obraexpo ActualizarUno (@RequestBody Obraexpo entidadObraexpo,
									  @PathVariable int id_obraexpo) {
		return obraExpoService.ActualizarUno(id_obraexpo, entidadObraexpo);
	}
}
