package com.example.book_spring.Service;

import com.example.book_spring.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findALLbook();
    Optional <Book> findbyID(Integer masach);
    void save(Book book);
    void remove(Book book) ;

}
