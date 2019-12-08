package com.learn.restfulwebservices.bHardCodedData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	public void addNewUser(@RequestBody User user){
		userDAOService.save(user);

	}
}
