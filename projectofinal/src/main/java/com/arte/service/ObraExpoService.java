package com.arte.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Obraexpo;
import com.arte.repository.ObraExpoRepository;


@Service
public class ObraExpoService {

	@Autowired
	private ObraExpoRepository obraExpoRepository;
	
	public ArrayList<Obraexpo> BuscarTodos () {
		return (ArrayList<Obraexpo>) obraExpoRepository.findAll();
	}
	
	public Optional<Obraexpo> BuscarUno (int id_obraexpo) {
		return obraExpoRepository.findById(id_obraexpo);
	}
	
	public Obraexpo Guardar (Obraexpo id_obraexpo) {
		return obraExpoRepository.save(id_obraexpo);
	}
	
	public void EliminarUno (int id_obraexpo) {
		obraExpoRepository.deleteById(id_obraexpo);
	}
	
	public Obraexpo ActualizarUno (int id_obraexpo, Obraexpo ObraExpoActualizar) {
		Obraexpo ObraExpoRetorna = new Obraexpo();
		Optional<Obraexpo> p = obraExpoRepository.findById(id_obraexpo);
		if (p.isPresent()) {
			ObraExpoRetorna = p.get();
			ObraExpoRetorna = ObraExpoActualizar;
			obraExpoRepository.save(ObraExpoRetorna);
		}
		return ObraExpoRetorna;
	}
}
