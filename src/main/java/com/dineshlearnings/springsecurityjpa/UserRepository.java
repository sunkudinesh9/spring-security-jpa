package com.dineshlearnings.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dineshlearnings.springsecurityjpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String userame);
}
