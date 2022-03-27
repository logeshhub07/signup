package com.register.cr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.register.user.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
