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

import com.arte.entity.Obra;
import com.arte.services.ObraService;

@RestController
@RequestMapping("/Obra")

public class ObraController {

	@Autowired
	private ObraService obraService;
	
	@GetMapping
	public ArrayList<Obra> ListarTodos () {
		return obraService.BuscarTodos();
	}
	
	@GetMapping("/{idObra}")
	public Optional<Obra> ListarUno (@PathVariable int idObra) {
		return obraService.BuscarUno(idObra);
	}
	
	@PostMapping
	public ResponseEntity<Obra> Guardar (@RequestBody Obra entidadObra) {
		return new ResponseEntity<Obra>(obraService.Guardar(entidadObra), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{idObra}")
	public void EliminarUno (@PathVariable int idObra) {
		obraService.EliminarUno(idObra);
	}
	
	@PutMapping("/{idObra}")
	public Obra ActualizarUno (@RequestBody Obra entidadObra,
									  @PathVariable int idObra) {
		return obraService.ActualizarUno(idObra, entidadObra);
	}
}
