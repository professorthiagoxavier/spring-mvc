package com.fiap.myapp.controllers;

import org.springframework.web.bind.annotation.*;
import com.fiap.myapp.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@PostMapping
	public User createUser(@RequestBody User user) {
		// Process the user object
		return user;
	}

	@GetMapping("/{name}")
	public User getUser(@PathVariable String name) {
		// Create a dummy user for demonstration
		User user = new User();
		user.setName(name);
		user.setAge(30);
		return user;
	}
}
