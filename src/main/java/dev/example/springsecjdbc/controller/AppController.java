package dev.example.springsecjdbc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public ResponseEntity<String> home() {
		return new ResponseEntity<String>("Welcome Home", HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<String> user() {
		return new ResponseEntity<String>("Welcome User", HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin() {
		return new ResponseEntity<String>("Welcome Admin", HttpStatus.OK);
	}
	
	@GetMapping("/logout")
	public ResponseEntity<String> logout() {
		SecurityContextHolder.clearContext();
		return new ResponseEntity<String>("Logged out", HttpStatus.OK);
	}
}
