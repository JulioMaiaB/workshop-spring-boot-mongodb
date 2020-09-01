package com.juliobeani.workshopmongo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juliobeani.workshopmongo.domain.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User(1L, "Julio", "julio@gmail.com");
		User u2 = new User(2L, "Deia", "deia@gmail.com");
		
		return ResponseEntity.ok().body(Arrays.asList(u1, u2));
	}
	
}