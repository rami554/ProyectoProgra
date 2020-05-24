package com.arte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.entity.Obraexpo;
import com.arte.repository.ObraExpoRepository;


@Service
public class ObraExpoService {

	@Autowired
	private ObraExpoRepository obraExpoRepository;
	
	public List<Obraexpo> BuscarTodos(){
		return (List<Obraexpo>) obraExpoRepository.findAll();
	}
}
