package net.springboot.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.springboot.repository.UserRepository;
import net.springboot.web.dto.UserRegistrationDto;


@RestController
@RequestMapping("/")
public class UserRegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addUsers")
	public void addUsers(@RequestBody UserRegistrationDto users) {
		userRepository.save(users);	
		
	}
	@GetMapping("/getAllUsers")
	public List<net.springboot.model.User> getAllUser(){
		return userRepository.findAll();			
	}
	
	
	
	
}
