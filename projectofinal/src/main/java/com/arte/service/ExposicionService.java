package com.arte.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ExposicionRepository;
import com.arte.entity.Exposicion;
import com.arte.entity.Obraexpo;
import com.arte.repository.ObraExpoRepository;


@Service
public class ExposicionService {
	@Autowired
	private ExposicionRepository exposicionRepository;
	private ObraExpoRepository obraExpoRepository;
	
	public ArrayList<Exposicion> BuscarTodos () {
		return (ArrayList<Exposicion>) exposicionRepository.findAll();
	}
	
	public Optional<Exposicion> BuscarUno (int idExposicion) {
		return exposicionRepository.findById(idExposicion);
	}
	
	public Exposicion Guardar (Exposicion Exposicion) {
		return exposicionRepository.save(Exposicion);
	}
	
	public void EliminarUno (int idExposicion) {
		exposicionRepository.deleteById(idExposicion);
	}
	
	public Exposicion ActualizarUno (int idExposicion, Exposicion ExposicionActualizar) {
		Exposicion ExposicionRetorna = new Exposicion();
		Optional<Exposicion> p = exposicionRepository.findById(idExposicion);
		if (p.isPresent()) {
			ExposicionRetorna = p.get();
			ExposicionRetorna = ExposicionActualizar;
			exposicionRepository.save(ExposicionRetorna);
		}
		return ExposicionRetorna;
	}
	
	public String ConfirmarBorrado (int idExposicion) {
		Optional<Exposicion> p = exposicionRepository.findById(idExposicion);
		Optional<Obraexpo> 	q= obraExpoRepository.findAll(idExposicion);
		if (q.isPresent() ) {
			return String.valueOf("La exposicion no se puede borrar porque existe el dato en expoobra ");
		}else {
			exposicionRepository.deleteById(idExposicion);
			return String.valueOf("La exposicion se borro");
		}
	}

}



//Primero se debe borrar en obraexpo para borrar en la exposicion y la obra
//Si quieres borrar una persona primero debes borrar la obra que hizo o la obra que es de su propiedad 
