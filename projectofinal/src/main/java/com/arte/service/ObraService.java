package com.arte.service;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Obra;
import com.arte.repository.ObraRepository;


@Service
public class ObraService {

	@Autowired
	private ObraRepository obraRepository;
	
	public ArrayList<Obra> BuscarTodos () {
		return (ArrayList<Obra>) obraRepository.findAll();
	}
	
	public Optional<Obra> BuscarUno (int idObra) {
		return obraRepository.findById(idObra);
	}
	
	public Obra Guardar (Obra Obra) {
		return obraRepository.save(Obra);
	}
	
		
	public void EliminarUno (int idObra) {
		try {
			obraRepository.deleteById(idObra);
			}catch (Exception e) {
				System.out.println("La Obra Existe en una una expocicion");
			}
	}
	
	
	public Obra ActualizarUno (int idObra, Obra ObraActualizar) {
		Obra ObraRetorna = new Obra();
		Optional<Obra> p = obraRepository.findById(idObra);
		if (p.isPresent()) {
			ObraRetorna = p.get();
			ObraRetorna = ObraActualizar;
			obraRepository.save(ObraRetorna);
		}
		return ObraRetorna;
	}
}
