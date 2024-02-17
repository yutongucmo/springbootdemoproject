package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    // Dependency Injection: it is a design pattern used in software development to achieve Inversion of Control between classes and their dependency
    // Insert a book into our h2-database

    // Instead of instantiating a BookRepository inside this class directly, we let Spring framework inject it for us:
//    @Autowired
//    public BookService(BookRepository bookRepository){
//        this.bookRepository = bookRepository;
//    }

    @Transactional
    public Book create(Book book){
        return bookRepository.save(book);
    }

    @Transactional
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
