package com.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
