package com.register.cr;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.user.User;


@RestController
@RequestMapping("/user")
@CrossOrigin(origins = " http://localhost:3000")
public class Controller {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addUsers")
	public String add(@RequestBody User user) {
		userRepository.save(user);
		return "new user has been added";
	}
	@GetMapping("/getAllUsers")
	public List<User> getAllUser(){
		return userRepository.findAll();			
	}
	

}
