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
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<BookEntity> getBook(){
        return  service.get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> delete(@PathVariable Long id){
        return  service.delete(id) ?
                    ResponseEntity.ok("Book successfully deleted") :
                    ResponseEntity.notFound().build();
    }

}
