package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entitiy.BookEntity;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    //ai spring freamwork walin ena autowired eka wenuwata
    //lombok welin ena requestargrconstuctor use karanne
    //construter injecjtions study
    //@Autowired
   //BookService service;

    final BookService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED) // project stander
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<BookEntity> getBook(){
        return  service.getBook();
    }
}
