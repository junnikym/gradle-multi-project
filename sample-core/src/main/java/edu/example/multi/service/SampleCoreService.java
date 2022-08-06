package edu.example.multi.service;

import org.springframework.stereotype.Service;

@Service
public class SampleCoreService {

	public String echo(String message) {
		return message;
	}

}
