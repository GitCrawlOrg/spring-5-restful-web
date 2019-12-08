package com.learn.restfulwebservices.bHardCodedData;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/hardCodedData")
public class UserController {

	@Autowired
	private UserDAOService userDAOService;

	//Retrieve all users
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return userDAOService.findAll();
	}

	//Retrieve specific users
	@GetMapping(path = "/user/{id}")
	public User retrieveUserById(@PathVariable int id){
		return userDAOService.findById(id);
	}

	//Add a new User
	@PostMapping("/users")
	public ResponseEntity<Object> addNewUser(@RequestBody User user){
		User savedUser = userDAOService.save(user);

		//Send the URI of the saved Object
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
}
