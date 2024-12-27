package com.albouspringdatajpa.jpa.repository;

import com.albouspringdatajpa.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
