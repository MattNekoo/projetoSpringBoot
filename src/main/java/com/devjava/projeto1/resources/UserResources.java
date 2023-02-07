package com.devjava.projeto1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjava.projeto1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "a", "9", "12345");
		return ResponseEntity.ok().body(u);
	}
}
