package com.arte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Persona")

public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	
}
