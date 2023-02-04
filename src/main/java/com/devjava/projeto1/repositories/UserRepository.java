package com.devjava.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjava.projeto1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
