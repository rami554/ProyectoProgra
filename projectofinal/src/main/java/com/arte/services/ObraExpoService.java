package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arte.repository.ObraExpoRepository;


@Service
public class ObraExpoService {

	@Autowired
	private ObraExpoRepository obraExpoRepository;
}
