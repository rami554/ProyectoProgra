package com.arte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Venta;
import com.arte.repository.VentaRepository;


@Service
public class VentaService {

	@Autowired
	private VentaRepository ventaRepository;
	
	public List<Venta> BuscarTodos(){
		return (List<Venta>) ventaRepository.findAll();
	}
}
