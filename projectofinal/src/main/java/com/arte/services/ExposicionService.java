package com.arte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ExposicionRepository;
import com.arte.entity.Exposicion;


@Service
public class ExposicionService {

	@Autowired
	private ExposicionRepository exposicionRepository;
	
	public List<Exposicion> BuscarTodos(){
		return (List<Exposicion>) exposicionRepository.findAll();
	}

}
