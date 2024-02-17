package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Book;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // DAO data access class
    // generates CRUD functions: CREATE, REMOVE, UPDATE, DELETE
}
