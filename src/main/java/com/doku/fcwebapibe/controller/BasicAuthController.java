package com.doku.fcwebapibe.controller;

import com.doku.fcwebapibe.dto.AuthenticationDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	@GetMapping(path = "/auth")
	public AuthenticationDTO auth() {
		return new AuthenticationDTO("You are authenticated");
	}	
}
