package com.arte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arte.services.ExposicionService;

@RestController
@RequestMapping("/Persona")

public class ExposicionController {

	@Autowired
	private ExposicionService exposicionService;
}
