package com.arte.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExposicionService {

	@Autowired
	private ExposicionRepository exposicionRepository;
}
