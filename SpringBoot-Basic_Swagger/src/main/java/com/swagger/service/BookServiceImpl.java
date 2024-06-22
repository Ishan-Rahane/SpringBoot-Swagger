package com.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.dao.BookRepository;
import com.swagger.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repo;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Book> getById(int bookId) {
		// TODO Auto-generated method stub
		return repo.findById(bookId);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	public List<Book> removeBook(int bookId) {
		repo.deleteById(bookId);
		return repo.findAll();
	}
}
