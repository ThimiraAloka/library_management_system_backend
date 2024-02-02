package org.example.service.impl;

import org.example.dto.Book;
import org.example.entitiy.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository repository;

    ModelMapper mapper;
    @Bean
    public void setUp(){
        this.mapper=new ModelMapper();
    }

    // Ai noraml object ekkak hadanne nathuwa method ekkak hadala eka @Bean dala
    // me wade karanne >>> ModelMapper mapper = new ModelMapper(); kiyala dammath wenne
    // me wena demane

    @Override
    public void addBook(Book book) {
        BookEntity entity = mapper.map(book, BookEntity.class);
        repository.save(entity);
    }

    @Override
    public List<BookEntity> getBook() {
        return  repository.findAll();
    }
}
