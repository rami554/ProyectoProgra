package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ObraRepository;


@Service
public class ObraService {

	@Autowired
	private ObraRepository obraRepository;
}
