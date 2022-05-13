package com.udemy.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}