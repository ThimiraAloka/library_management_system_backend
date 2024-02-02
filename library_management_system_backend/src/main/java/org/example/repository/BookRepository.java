package org.example.repository;

import org.example.entitiy.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<BookEntity,Long> {
}

//what is deferent JpaRepository and CrudRepository