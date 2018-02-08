package com.example.springaopcustomannotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springaopcustomannotation.aspect.CustomerAnnotation;

@RestController
@RequestMapping("/")
public class MyController extends Controller {

	@CustomerAnnotation
	@GetMapping
	public void controllerTest() {
		System.out.println("Inside controllerTest");
	}

}
