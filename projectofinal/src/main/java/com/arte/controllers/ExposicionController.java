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

import com.arte.service.ExposicionService;
import com.arte.entity.Exposicion;;

@RestController
@RequestMapping("/Exposicion")

public class ExposicionController {

	@Autowired
	private ExposicionService exposicionService;
	
	@GetMapping()
	public ArrayList<Exposicion> ListarTodos () {
		return exposicionService.BuscarTodos();
	}
	
	@GetMapping("/{idExposicion}")
	public Optional<Exposicion> ListarUno (@PathVariable int idExposicion) {
		return exposicionService.BuscarUno(idExposicion);
	}
	
	@PostMapping
	public ResponseEntity<Exposicion> Guardar (@RequestBody Exposicion entidadExposicion) {
		return new ResponseEntity<Exposicion>(exposicionService.Guardar(entidadExposicion), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{idExposicion}")
	public void EliminarUno (@PathVariable int idExposicion) {
		exposicionService.EliminarUno(idExposicion);
	}
	
	@PutMapping("/{idExposicion}")
	public Exposicion ActualizarUno (@RequestBody Exposicion entidadExposicion,@PathVariable int idExposicion) {
		return exposicionService.ActualizarUno(idExposicion, entidadExposicion);
	}

	@DeleteMapping("/filtro/{idExposicion}")
	public void ConfirmarBorrado (@PathVariable int idExposicion) {
		exposicionService.ConfirmarBorrado(idExposicion);
	}
}
