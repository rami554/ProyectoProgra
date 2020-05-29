package com.arte.service;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ExposicionRepository;

import net.minidev.json.JSONObject;

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
	
	public Exposicion Guardar (Exposicion idExposicion) {
		ArrayList<Exposicion> p = (ArrayList<com.arte.entity.Exposicion>) exposicionRepository.findAll();
		for (int i=0; i<=p.size();i++) {
			System.out.println(i);
			if(p.get(i).getFechainauguracion().compareTo((idExposicion.getFechainauguracion()))!=0){
				System.out.println("son iguales");
				return exposicionRepository.save(idExposicion);
			} else {
				System.out.println("son distintas");
				continue;
			}
		}
		return idExposicion;
	}
	
	public void EliminarUno (int idExposicion) {
		try {
			exposicionRepository.deleteById(idExposicion);
			}catch (Exception e) {
				System.out.println("La Expocion tiene obras en la sala");
			}
		
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
	
	/*public void ConfirmarBorrado (int idExposicion) {
		obraExpoRepository.findAll();
		
		/*for(int i = 0 ; i < p.size();i++) {
            if(p.get(i).getId_exposicion() == 1) {
            	System.out.println(p.get(i).getId_exposicion());
            } else {
            	System.out.println(p.get(i).getId_exposicion());    
            }
        }*/

}



//Primero se debe borrar en obraexpo para borrar en la exposicion y la obra
//Si quieres borrar una persona primero debes borrar la obra que hizo o la obra que es de su propiedad 
