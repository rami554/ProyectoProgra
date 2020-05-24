package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arte.repository.ExposicionRepository;


@Service
public class ExposicionService {

	@Autowired
	private ExposicionRepository exposicionRepository;
}
