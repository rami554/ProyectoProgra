package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.PersonaRepository;


@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
}
