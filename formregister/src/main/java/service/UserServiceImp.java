package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.cr.UserRepository;
import com.register.user.User;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {		
		return userRepository.save(user);
	}


	@Override
	public List<User> getAllUser() {		
		return userRepository.findAll();
	}
	

}
