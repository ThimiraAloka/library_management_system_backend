package org.example.service;

import org.example.dto.Book;
import org.example.entitiy.BookEntity;

import java.util.Base64;
import java.util.List;

public interface BookService {
    void add(Book book);
    List <BookEntity> get();
    boolean delete(Long id);
}
