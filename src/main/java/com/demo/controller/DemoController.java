package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.impl.DemoService;



@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	DemoService demoService;
	@GetMapping("/get-all")
	public ResponseEntity<String> getAlldemo() {
		return demoService.getdemo();
	}
}
