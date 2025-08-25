package com.example.mapping;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	
	
	private Logger log = LoggerFactory.getILogger(UserController.class);
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/adduser")
	public User addNewUser(@RequestBody User user)
	{
		
		User SaveUser = repository.save(user);
		return SaveUser;
	}
	

}
