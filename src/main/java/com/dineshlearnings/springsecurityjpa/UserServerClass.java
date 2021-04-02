package com.dineshlearnings.springsecurityjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dineshlearnings.springsecurityjpa.model.User;

@Service
public class UserServerClass {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}
}
