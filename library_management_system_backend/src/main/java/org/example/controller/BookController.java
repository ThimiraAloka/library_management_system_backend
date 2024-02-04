package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entitiy.BookEntity;
import org.example.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin
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
        service.add(book);
    }
    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<BookEntity> getBook(){
        return  service.get();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable Long id){
         service.delete(id);
        return "Book Deleted";
    }
    @GetMapping("/search/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  Book searchById(@PathVariable Long id){
        return service.searchById(id);
    }
}
