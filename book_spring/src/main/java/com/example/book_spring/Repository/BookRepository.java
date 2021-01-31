package com.example.book_spring.Repository;

import com.example.book_spring.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
s