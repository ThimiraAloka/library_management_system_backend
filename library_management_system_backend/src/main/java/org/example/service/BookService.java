package org.example.service;

import org.example.dto.Book;
import org.example.entitiy.BookEntity;

import java.util.Base64;
import java.util.List;

public interface BookService {
    void addBook(Book book);
    List <BookEntity> getBook();
}
