package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.VentaRepository;


@Service
public class VentaService {

	@Autowired
	private VentaRepository ventaRepository;
}
