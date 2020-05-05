package com.jak.library_management.repository;

import com.jak.library_management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByNameContainingOrAuthorContaining(String name, String author);
}