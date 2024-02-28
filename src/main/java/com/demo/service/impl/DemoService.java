package com.demo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public ResponseEntity<String> getdemo() {
		return new ResponseEntity<>("This is a demo API", HttpStatus.OK);
	}
}
