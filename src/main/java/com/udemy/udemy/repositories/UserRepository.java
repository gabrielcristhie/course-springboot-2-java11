package com.udemy.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}