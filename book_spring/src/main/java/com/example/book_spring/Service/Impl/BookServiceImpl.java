package com.example.book_spring.Service.Impl;

import com.example.book_spring.Model.Book;
import com.example.book_spring.Repository.BookRepository;
import com.example.book_spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl  implements BookService {
    private BookRepository bookRepository ;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository =bookRepository ;
    }


    @Override
    public List<Book> findALLbook() {
        return (List<Book>) bookRepository.findAll();

    }

    @Override
    public Optional<Book> findbyID(Integer masach) {
        return bookRepository.findById(masach) ;

    }

    @Override
    public void save(Book book) {
        bookRepository.save(book) ;

    }

    @Override
    public void remove(Book book) {
        bookRepository.delete(book);

    }
}
