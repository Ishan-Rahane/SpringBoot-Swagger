package com.swagger.service;

import java.util.List;
import java.util.Optional;

import com.swagger.entity.Book;

public interface BookService {

	List<Book> getAllBooks();

	Optional<Book> getById(int bookId);

	Book addBook(Book book);

	Book updateBook(Book book);

	List<Book> removeBook(int bookId);


}
