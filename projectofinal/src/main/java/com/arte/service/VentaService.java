package com.arte.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Venta;
import com.arte.entity.Venta;
import com.arte.repository.VentaRepository;


@Service
public class VentaService {

	@Autowired
	private VentaRepository ventaRepository;
	
	public ArrayList<Venta> BuscarTodos () {
		return (ArrayList<Venta>) ventaRepository.findAll();
	}
	
	public Optional<Venta> BuscarUno (int idVenta) {
		return ventaRepository.findById(idVenta);
	}
	
	public Venta Guardar (Venta Venta) {
		return ventaRepository.save(Venta);
	}
	
	public void EliminarUno (int idVenta) {
		ventaRepository.deleteById(idVenta);
	}
	
	public Venta ActualizarUno (int idVenta, Venta VentaActualizar) {
		Venta VentaRetorna = new Venta();
		Optional<Venta> p = ventaRepository.findById(idVenta);
		if (p.isPresent()) {
			VentaRetorna = p.get();
			VentaRetorna = VentaActualizar;
			ventaRepository.save(VentaRetorna);
		}
		return VentaRetorna;
	}
}
