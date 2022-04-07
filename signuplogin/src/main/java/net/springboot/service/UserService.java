package net.springboot.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.springboot.model.User;
import net.springboot.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	
	public List<User> getAllUser();
	
	User saveUser(UserRegistrationDto user);
	
}
