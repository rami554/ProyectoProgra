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

import com.arte.entity.Venta;
import com.arte.service.VentaService;

@RestController
@RequestMapping("/Venta")

public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@GetMapping
	public ArrayList<Venta> ListarTodos () {
		return ventaService.BuscarTodos();
	}
	
	@GetMapping("/{idVenta}")
	public Optional<Venta> ListarUno (@PathVariable int idVenta) {
		return ventaService.BuscarUno(idVenta);
	}
	
	@PostMapping
	public ResponseEntity<Venta> Guardar (@RequestBody Venta entidadVenta) {
		return new ResponseEntity<Venta>(ventaService.Guardar(entidadVenta), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{idVenta}")
	public void EliminarUno (@PathVariable int idVenta) {
		ventaService.EliminarUno(idVenta);
	}
	
	@PutMapping("/{idVenta}")
	public Venta ActualizarUno (@RequestBody Venta entidadVenta,
									  @PathVariable int idVenta) {
		return ventaService.ActualizarUno(idVenta, entidadVenta);
	}
	
}
