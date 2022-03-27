package service;

import java.util.List;

import com.register.user.User;

public interface UserService {
	public User saveUser(User user);
	public List<User> getAllUser();
	

}
