package net.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springboot.model.User;
import net.springboot.web.dto.UserRegistrationDto;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);

	 void save(UserRegistrationDto users);
	
}
