package org.example.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//study dto and entity
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}
