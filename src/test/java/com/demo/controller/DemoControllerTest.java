package com.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.service.impl.DemoService;

@ExtendWith(MockitoExtension.class)
public class DemoControllerTest {
	@InjectMocks
	DemoController demoController;
 
	@Mock
	DemoService serviceImpl;
 
	@Test
	void getApiTest() {
		ResponseEntity<String> obj = new ResponseEntity<String>("this is a demo API", HttpStatus.OK);
		when(serviceImpl.getdemo()).thenReturn(obj);
		ResponseEntity<String> response = demoController.getAlldemo();
		assertEquals(obj, response);
	}
}

