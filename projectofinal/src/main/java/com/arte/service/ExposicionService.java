package com.arte.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ExposicionRepository;
import com.arte.entity.Exposicion;


@Service
public class ExposicionService {
	@Autowired
	private ExposicionRepository exposicionRepository;
	
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
	
//	public String ConfirmarBorrado (int idExposicion) {
//		Optional<Exposicion> p = exposicionRepository.findById(idExposicion);
//		if (p.get().getTipocli().toString().toLowerCase().equals("malo") ) {
//			exposicionRepository.deleteById(idExposicion);
//			return String.valueOf("La exposicion se borro");
//		}else {
//			
//			return String.valueOf("La exposicion no se puede borrar");
//		}
//	}

}
