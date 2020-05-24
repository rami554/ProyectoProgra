package com.arte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Obra;
import com.arte.repository.ObraRepository;


@Service
public class ObraService {

	@Autowired
	private ObraRepository obraRepository;
	
	public List<Obra> BuscarTodos(){
		return (List<Obra>) obraRepository.findAll();
	}
}
