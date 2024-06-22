package com.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.entity.Book;
import com.swagger.service.BookService;

@RestController
@RequestMapping("/rest")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return service.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> getById(@PathVariable int bookId)
	{
		return service.getById(bookId);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
		return service.addBook(book);
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book)
	{
		return service.updateBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId) {
		return service.removeBook(bookId);

	}
}
