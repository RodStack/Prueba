package com.rodauth.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String home() {
		return "Este es el home todos tienen acceso";
	}
	
	@GetMapping("/secret")
	public String secret() {
		return "Acceso restingido si ves este mensaje estas autorizado";
	}
	
}
